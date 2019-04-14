package com.leto.server.web.order;

import com.haulmont.cuba.gui.model.CollectionChangeType;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.screen.*;
import com.leto.server.entity.Order;
import com.leto.server.entity.OrderLine;

import javax.inject.Inject;
import java.math.BigDecimal;

@UiController("leto$Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {

    @Inject
    private CollectionPropertyContainer<OrderLine> linesDc;

    @Subscribe(id = "linesDc", target = Target.DATA_CONTAINER)
    private void onLinesDcCollectionChange(CollectionContainer.CollectionChangeEvent<OrderLine> event) {
        if (event.getChangeType() != CollectionChangeType.REFRESH) {
            calculateAmount();
        }
    }

    private void calculateAmount() {
        BigDecimal amount = BigDecimal.ZERO;
        for (OrderLine line : linesDc.getItems()) {
            amount = amount.add(line.getProduct().getPrice().multiply(line.getQuantity()));
        }
        getEditedEntity().setAmount(amount);
    }
}