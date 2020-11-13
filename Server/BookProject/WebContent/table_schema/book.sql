
drop table bookshop purge;
drop table member purge;

select * from tab;

--------

create table member (
	userid varchar2(8) primary key,
	userpwd varchar2(10) not null
);


insert into member values ('candy', '1234');
insert into member values ('admin', '5678');
commit 

select * from member;

-----

create table bookshop (
	isbn varchar2(15) primary key,
	title varchar2(50) not null,
	author varchar2(30) not null,
	company varchar2(50),
	price number
);


insert into bookshop values('88-90-11', '오라클 3일 완성', '이오라', '야메루출판사', 15000);
insert into bookshop values('90-10-12', 'JSP 달인되기', '송JP', '공갈닷컴', 20000);
insert into bookshop values('87-90-33', '자바무따기', '김자바', '디지털박스', 35000);
commit;


UPDATE BOOKSHOP SET ISBN='87-90-33', TITLE='자바무따기2', AUTHOR='김자', COMPANY='디지털박스으', PRICE=36000 WHERE ISBN='87-90-33'

select * from bookshop;