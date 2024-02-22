select * from DBA_PDBS;

select name, cdb from V$DATABASE;

select * from V$DATABASE;

create user C##shared1 IDENTIFIED BY shared1 CONTAINER=ALL;

create user C##shared2 IDENTIFIED BY shared2 CONTAINER=ALL ACCOUNT LOCK;