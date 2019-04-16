-- begin LETO_CUSTOMER
create table LETO_CUSTOMER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    STREET varchar(255),
    CITY_ID uuid,
    COUNTRY_ID uuid,
    --
    NAME varchar(255) not null,
    EMAIL varchar(255),
    --
    primary key (ID)
)^
-- end LETO_CUSTOMER
-- begin LETO_COUNTRY
create table LETO_COUNTRY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE varchar(255) not null,
    CODE_ISO varchar(255),
    DOMAIN varchar(255),
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end LETO_COUNTRY
-- begin LETO_ORDER
create table LETO_ORDER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DATE_ date not null,
    AMOUNT decimal(19, 2),
    CUSTOMER_ID uuid,
    --
    primary key (ID)
)^
-- end LETO_ORDER
-- begin LETO_PRODUCT
create table LETO_PRODUCT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    PRICE decimal(19, 2),
    --
    primary key (ID)
)^
-- end LETO_PRODUCT
-- begin LETO_CITY
create table LETO_CITY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    COUNTRY_ID uuid,
    --
    primary key (ID)
)^
-- end LETO_CITY
-- begin LETO_ORDER_LINE
create table LETO_ORDER_LINE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_ID uuid,
    PRODUCT_ID uuid not null,
    QUANTITY decimal(19) not null,
    --
    primary key (ID)
)^
-- end LETO_ORDER_LINE
-- begin LETO_COMPANY
create table LETO_COMPANY (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end LETO_COMPANY
