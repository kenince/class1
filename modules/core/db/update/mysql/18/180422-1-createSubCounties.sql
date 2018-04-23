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
);
