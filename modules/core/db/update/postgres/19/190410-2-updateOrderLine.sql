-- alter table LETO_ORDER_LINE add column PRODUCT_ID uuid ^
-- update LETO_ORDER_LINE set PRODUCT_ID = <default_value> ;
-- alter table LETO_ORDER_LINE alter column PRODUCT_ID set not null ;
alter table LETO_ORDER_LINE add column PRODUCT_ID uuid not null ;
alter table LETO_ORDER_LINE add column QUANTITY decimal(19) ^
update LETO_ORDER_LINE set QUANTITY = 0 where QUANTITY is null ;
alter table LETO_ORDER_LINE alter column QUANTITY set not null ;
alter table LETO_ORDER_LINE add column ORDER_ID uuid ;
