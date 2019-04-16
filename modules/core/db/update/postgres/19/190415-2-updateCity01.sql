alter table LETO_CITY add constraint FK_LETO_CITY_ON_COUNTRY foreign key (COUNTRY_ID) references LETO_COUNTRY(ID);
create index IDX_LETO_CITY_ON_COUNTRY on LETO_CITY (COUNTRY_ID);
