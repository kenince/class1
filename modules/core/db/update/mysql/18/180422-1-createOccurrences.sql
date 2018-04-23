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
);
