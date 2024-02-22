CREATE DATABASE DB1
USER SASWATA IDENTIFIED BY SASWATA;

CREATE TABLE newtable (
  testvalue NUMBER(4)
);

desc newtable;

INSERT INTO newtable (testvalue)
VALUES (1);

create table priv_test (
    col1 date
);

select sysdate from dual;

insert into priv_test values(sysdate);
select * from priv_test;

select * from hr.employees;