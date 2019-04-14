package com.leto.server.web.city;

import com.leto.server.entity.City;
import com.haulmont.cuba.gui.screen.StandardLookup;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.LookupComponent;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.cuba.gui.screen.LoadDataBeforeShow;

@UiController("leto$City.browse")
@UiDescriptor("city-browse.xml")
@LookupComponent("citysTable")
@LoadDataBeforeShow
public class CityBrowse extends StandardLookup<City> {
}