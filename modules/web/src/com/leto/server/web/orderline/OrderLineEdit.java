package com.leto.server.web.orderline;

import com.haulmont.cuba.gui.screen.EditedEntityContainer;
import com.haulmont.cuba.gui.screen.StandardEditor;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import com.haulmont.cuba.gui.screen.LoadDataBeforeShow;
import com.leto.server.entity.OrderLine;

@UiController("leto$OrderLine.edit")
@UiDescriptor("orderline-edit.xml")
@EditedEntityContainer("orderlineDc")
@LoadDataBeforeShow
public class OrderLineEdit extends StandardEditor<OrderLine> {
}