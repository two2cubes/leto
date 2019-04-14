package com.leto.server.web.customer;

import com.leto.server.entity.Customer;
import com.haulmont.cuba.gui.screen.StandardLookup;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.LookupComponent;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.cuba.gui.screen.LoadDataBeforeShow;

@UiController("leto$Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}