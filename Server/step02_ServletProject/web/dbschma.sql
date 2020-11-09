-- Oracle
select * from tab;

create table users(
num int primary key,
name varchar2(16) not null,
phone varchar2(15),
addr varchar2(50));

create sequence seq_no increment by 1 start with 1 nocycle nocache;

select * from users; 
drop table users;


--MySQL로 작성
show tables;

create table users(
num int primary key auto_increment,
name varchar(16) not null,
phone varchar(15),
addr varchar(50));

select * from users; 
drop table users;










