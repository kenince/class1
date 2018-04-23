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
);
