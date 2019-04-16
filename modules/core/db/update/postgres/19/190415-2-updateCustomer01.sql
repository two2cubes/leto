alter table LETO_CUSTOMER add constraint FK_LETO_CUSTOMER_ON_COUNTRY foreign key (COUNTRY_ID) references LETO_COUNTRY(ID);
