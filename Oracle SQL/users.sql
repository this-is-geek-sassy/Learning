select * from tab;

select * from all_users;

CREATE USER user1 IDENTIFIED BY user1;

CREATE USER user2 IDENTIFIED BY user2 PASSWORD EXPIRE;

ALTER USER user1 IDENTIFIED BY "user-1-new";
ALTER USER USER1 ACCOUNT LOCK;

-- DROP USER user1;
-- drop user user1 cascade;

create user user_random identified by "sample password" PASSWORD EXPIRE;

create user shared1 IDENTIFIED BY shared1 CONTAINER=ALL;

create user saswata IDENTIFIED BY saswata;
grant create session to saswata;
GRANT CONNECT TO SASWATA;
GRANT CREATE TABLE, UNLIMITED TABLESPACE TO saswata;
grant create any VIEW to saswata;
GRANT SELECT_CATALOG_ROLE TO SASWATA;
GRANT SELECT ANY DICTIONARY TO SASWATA;


ALTER USER hr ACCOUNT UNLOCK;
ALTER USER HR IDENTIFIED BY hr;

-- Revoke privillage
-- REVOKE CONNECT FROM SASWATA;

create role newrole1;
grant select on HR.employees to newrole1;

create user user3;
grant newrole1 to user3;
grant newrole1 to saswata;
revoke newrole1 from saswata;

create role newrole2 IDENTIFIED BY test;

grant create any synonym to newrole1;