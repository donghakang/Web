select * from tab;

drop table goodsinfo purge;

create table goodsinfo(
code varchar(10),
name varchar(50),
price number,
maker varchar2(20));

insert into goodsinfo(code,name,price,maker) values('p0001','자바무따기',25000,'공갈닷컴');
insert into goodsinfo(code,name,price,maker) values('p0002','JSP 3일완성',30000,'야메루출판사');

select * from goodsinfo;

--데이타 추가하기
insert into goodsinfo(code,name,price,maker) values('p0005','자바1주일배우기',15000,'인포믹스');
insert into goodsinfo(code,name,price,maker) values('p0007','오라클',55000,'생능출판');
insert into goodsinfo(code,name,price,maker) values('p0008','Ajax',35000,'인포믹스');
insert into goodsinfo(code,name,price,maker) values('p0009','JSP',45000,'인포믹스');




