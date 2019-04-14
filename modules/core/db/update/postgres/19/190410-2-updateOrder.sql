alter table LETO_ORDER add column AMOUNT decimal(19, 2) ;
alter table LETO_ORDER add column CUSTOMER_ID uuid ;
alter table LETO_ORDER add column DATE_ date ^
update LETO_ORDER set DATE_ = current_date where DATE_ is null ;
alter table LETO_ORDER alter column DATE_ set not null ;
