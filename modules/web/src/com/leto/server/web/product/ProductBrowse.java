package com.leto.server.web.product;

import com.leto.server.entity.Product;
import com.haulmont.cuba.gui.screen.StandardLookup;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.LookupComponent;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.cuba.gui.screen.LoadDataBeforeShow;

@UiController("leto$Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}