-- begin LETO_CUSTOMER
alter table LETO_CUSTOMER add constraint FK_LETO_CUSTOMER_ON_CITY foreign key (CITY_ID) references LETO_CITY(ID)^
alter table LETO_CUSTOMER add constraint FK_LETO_CUSTOMER_ON_COUNTRY foreign key (COUNTRY_ID) references LETO_COUNTRY(ID)^
create index IDX_LETO_CUSTOMER_ON_CITY on LETO_CUSTOMER (CITY_ID)^
create index IDX_LETO_CUSTOMER_ON_COUNTRY on LETO_CUSTOMER (COUNTRY_ID)^
-- end LETO_CUSTOMER
-- begin LETO_COUNTRY
create unique index IDX_LETO_COUNTRY_UK_name on LETO_COUNTRY (name) where DELETE_TS is null ^
create unique index IDX_LETO_COUNTRY_UK_CODE on LETO_COUNTRY (CODE) where DELETE_TS is null ^
-- end LETO_COUNTRY
-- begin LETO_ORDER
alter table LETO_ORDER add constraint FK_LETO_ORDER_ON_CUSTOMER foreign key (CUSTOMER_ID) references LETO_CUSTOMER(ID)^
create index IDX_LETO_ORDER_ON_CUSTOMER on LETO_ORDER (CUSTOMER_ID)^
-- end LETO_ORDER
-- begin LETO_CITY
alter table LETO_CITY add constraint FK_LETO_CITY_ON_COUNTRY foreign key (COUNTRY_ID) references LETO_COUNTRY(ID)^
create unique index IDX_LETO_CITY_UK_NAME on LETO_CITY (NAME) where DELETE_TS is null ^
create index IDX_LETO_CITY_ON_COUNTRY on LETO_CITY (COUNTRY_ID)^
-- end LETO_CITY
-- begin LETO_ORDER_LINE
alter table LETO_ORDER_LINE add constraint FK_LETO_ORDER_LINE_ON_ORDER foreign key (ORDER_ID) references LETO_ORDER(ID)^
alter table LETO_ORDER_LINE add constraint FK_LETO_ORDER_LINE_ON_PRODUCT foreign key (PRODUCT_ID) references LETO_PRODUCT(ID)^
create index IDX_LETO_ORDER_LINE_ON_ORDER on LETO_ORDER_LINE (ORDER_ID)^
create index IDX_LETO_ORDER_LINE_ON_PRODUCT on LETO_ORDER_LINE (PRODUCT_ID)^
-- end LETO_ORDER_LINE
