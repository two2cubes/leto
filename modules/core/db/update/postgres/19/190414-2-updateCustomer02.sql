alter table LETO_CUSTOMER add constraint FK_LETO_CUSTOMER_ON_CITY foreign key (CITY_ID) references LETO_CITY(ID);
