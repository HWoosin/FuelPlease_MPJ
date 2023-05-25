create table users (
	user_id varchar(50) primary key,
    user_pw varchar(500) not null,
    user_name varchar(50) not null,
    user_phone1 varchar(50),
    user_phone2 varchar(50),
    user_email1 varchar(50),
    user_email2 varchar(50),
    user_addr varchar(300),
    addr_detail varchar(300),
	zip_cd varchar(50)
);
select * from users;
show databases;

grant all privileges on fueldb.* to fuel@localhost;

