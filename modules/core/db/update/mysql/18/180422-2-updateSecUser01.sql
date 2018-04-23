alter table SEC_USER add constraint FK_SEC_USER_STATION foreign key (STATION_ID) references VPS_STATIONS(ID);
create index IDX_SEC_USER_STATION on SEC_USER (STATION_ID);
