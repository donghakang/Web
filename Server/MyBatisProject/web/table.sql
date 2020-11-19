select * from tab;
drop table orderdetail purge;
drop table orderform purge;
drop table customer purge;
drop table product purge;

create table product(
no number primary key,
item varchar2(20),
price number,
regdate date);

drop sequence seq_no;
create sequence seq_no increment by 1 start with 1 nocycle nocache;

insert into product(no, item,price,regdate) values(seq_no.nextval,'PC',200000,'2012-01-01');
insert into product(no, item,price,regdate) values(seq_no.nextval,'TV',100000,'2012-05-04');
insert into product(no, item,price,regdate) values(seq_no.nextval,'NoteBook',250000,'2013-03-05');
insert into product(no, item,price,regdate) values(seq_no.nextval,'DeskTop PC',50000,'2013-03-05');
insert into product(no, item,price,regdate) values(seq_no.nextval,'Computer',350000,'2013-01-18');
insert into product(no, item,price,regdate) values(seq_no.nextval,'iPad Air',780000, SYSDATE);

select * from product;
select * from product where item like '%C%' and price>100000 and regdate>'2013-01-01';
select * from product where item like '%%' and price>0 and regdate>'1900-01-01';







select no, item, price, to_char(regdate, 'yyyy-mm-dd') 
from product;