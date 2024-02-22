select * from tab;

select * from all_users;

CREATE USER user1 IDENTIFIED BY user1;

CREATE USER user2 IDENTIFIED BY user2 PASSWORD EXPIRE;

ALTER USER user1 IDENTIFIED BY "user-1-new";
ALTER USER USER1 ACCOUNT LOCK;

-- DROP USER user1;
-- drop user user1 cascade;