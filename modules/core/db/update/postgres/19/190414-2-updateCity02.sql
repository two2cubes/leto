-- update LETO_CITY set NAME = <default_value> where NAME is null ;
alter table LETO_CITY alter column NAME set not null ;
