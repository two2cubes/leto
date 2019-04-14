alter table LETO_ORDER_LINE add constraint FK_LETO_ORDER_LINE_ON_ORDER foreign key (ORDER_ID) references LETO_ORDER(ID);
create index IDX_LETO_ORDER_LINE_ON_ORDER on LETO_ORDER_LINE (ORDER_ID);
