alter table VPS_DIVISION add constraint FK_VPS_DIVISION_COUNTY foreign key (COUNTY_ID) references VPS_COUNTIES(ID);
create index IDX_VPS_DIVISION_COUNTY on VPS_DIVISION (COUNTY_ID);
