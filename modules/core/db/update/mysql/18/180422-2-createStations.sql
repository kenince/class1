alter table VPS_STATIONS add constraint FK_VPS_STATIONS_DIVISION foreign key (DIVISION_ID) references VPS_DIVISION(ID);
create index IDX_VPS_STATIONS_DIVISION on VPS_STATIONS (DIVISION_ID);