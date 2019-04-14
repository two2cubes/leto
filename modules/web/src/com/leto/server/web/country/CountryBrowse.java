package com.leto.server.web.country;

import com.leto.server.entity.Country;
import com.haulmont.cuba.gui.screen.StandardLookup;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.LookupComponent;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.cuba.gui.screen.LoadDataBeforeShow;

@UiController("leto$Country.browse")
@UiDescriptor("country-browse.xml")
@LookupComponent("countrysTable")
@LoadDataBeforeShow
public class CountryBrowse extends StandardLookup<Country> {
}