-- begin VPS_OCCURRENCES
create table VPS_OCCURRENCES (
    ID integer,
    UUID varchar(32),
    CREATED_BY varchar(50),
    CREATE_TS datetime(3),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    VERSION integer not null,
    --
    OCCURRENCE_NO varchar(45),
    DESCRIPTION varchar(100),
    --
    primary key (ID)
)^
-- end VPS_OCCURRENCES
-- begin VPS_OCCURRENCE_TYPES
create table VPS_OCCURRENCE_TYPES (
    ID integer,
    --
    TYPE_NAME varchar(255),
    --
    primary key (ID)
)^
-- end VPS_OCCURRENCE_TYPES
-- begin VPS_OCCURRENCE_STATUS
create table VPS_OCCURRENCE_STATUS (
    ID integer,
    --
    STATUS_DESC varchar(255),
    --
    primary key (ID)
)^
-- end VPS_OCCURRENCE_STATUS
-- begin VPS_DIVISION
create table VPS_DIVISION (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    DIVISION_NAME varchar(255),
    COUNTY_ID varchar(32),
    --
    primary key (ID)
)^
-- end VPS_DIVISION
-- begin VPS_COUNTIES
create table VPS_COUNTIES (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    COUNTY_CODE integer not null,
    COUNTY_NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end VPS_COUNTIES
-- begin VPS_SUB_COUNTIES
create table VPS_SUB_COUNTIES (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    SUB_COUNTY varchar(255),
    COUNTY_ID varchar(32),
    --
    primary key (ID)
)^
-- end VPS_SUB_COUNTIES
-- begin VPS_STATIONS
create table VPS_STATIONS (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    STATION_NAME varchar(255),
    DIVISION_ID varchar(32),
    --
    primary key (ID)
)^
-- end VPS_STATIONS
-- begin VPS_OCCURRENCES_OCCURRENCE_TYPES_LINK
create table VPS_OCCURRENCES_OCCURRENCE_TYPES_LINK (
    OCCURRENCES_ID integer,
    OCCURRENCE_TYPES_ID integer,
    primary key (OCCURRENCES_ID, OCCURRENCE_TYPES_ID)
)^
-- end VPS_OCCURRENCES_OCCURRENCE_TYPES_LINK
-- begin VPS_OCCURRENCES_OCCURRENCE_STATUS_LINK
create table VPS_OCCURRENCES_OCCURRENCE_STATUS_LINK (
    OCCURRENCES_ID integer,
    OCCURRENCE_STATUS_ID integer,
    primary key (OCCURRENCES_ID, OCCURRENCE_STATUS_ID)
)^
-- end VPS_OCCURRENCES_OCCURRENCE_STATUS_LINK
-- begin SEC_USER
alter table SEC_USER add column STATION_ID varchar(32) ^
alter table SEC_USER add column DTYPE varchar(100) ^
update SEC_USER set DTYPE = 'sec$User' where DTYPE is null ^
-- end SEC_USER
