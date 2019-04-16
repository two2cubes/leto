package com.leto.server.web.customer;

import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.leto.server.entity.City;
import com.leto.server.entity.Country;
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

    @Inject
    private CollectionLoader<City> citiesDl;

    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        ordersDl.setParameter("customer", getEditedEntity());
        getScreenData().loadAll();
    }

    @Subscribe("countryFld")
    private void onCountryFldValueChange(HasValue.ValueChangeEvent<Country> event) {
        citiesDl.setParameter("country", event.getValue());
        citiesDl.load();
    }

    @Subscribe("cityFld")
    private void onCityFldValueChange(HasValue.ValueChangeEvent<City> event) {
        if (event.getValue() != null) {
            System.out.println(event.getValue().getCountry());
        }
    }


}