package com.leto.server.web.customer;

import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.leto.server.entity.Customer;
import com.leto.server.entity.Order;

import javax.inject.Inject;

@UiController("leto$Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {

    @Inject
    private CollectionLoader<Order> ordersDl;

    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        ordersDl.setParameter("customer", getEditedEntity());
        getScreenData().loadAll();
    }
}