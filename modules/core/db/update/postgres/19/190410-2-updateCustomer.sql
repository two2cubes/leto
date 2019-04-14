alter table LETO_CUSTOMER add column EMAIL varchar(255) ;
alter table LETO_CUSTOMER add column NAME varchar(255) ^
update LETO_CUSTOMER set NAME = '' where NAME is null ;
alter table LETO_CUSTOMER alter column NAME set not null ;
