select * from tab;
select * from emp;

drop table emp;
drop sequence seq_eno;

create table emp(
eno number(6) primary key,
ename varchar2(20) not null,
phone varchar2(20),
dept varchar2(20));

create sequence seq_eno increment by 1 start with 1 nocycle nocache;

select * from emp;
delete from emp;
select * from emp where eno<=3 and dept like '%업%';