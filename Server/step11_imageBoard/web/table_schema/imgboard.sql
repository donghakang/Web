drop table imageboard purge;

create table  imageboard(
seq number primary key,                 --번호
imageid varchar(15) not null,           --상품코드 
imageName varchar2(20) not null,        --상품명
imagePrice  number,                     --단가
imageQty  number,                       --수량
imagecontent  varchar2(2000),           --내용  
imagepath  varchar2(80),                --이미지경로
logtime  date);                         --작성일

create sequence seq_imageboard increment by 1  start with 1 nocycle nocache;

select * from imageboard;
delete from IMAGEBOARD where seq=59;


INSERT INTO IMAGEBOARD VALUES(
SEQ_IMAGEBOARD.NEXTVAL,'a002','cat',1200,3,'고양이 구입','s16.jpg',SYSDATE);

INSERT INTO IMAGEBOARD VALUES(
SEQ_IMAGEBOARD.NEXTVAL,'a003','flower',2300,2,'해바라기 구입','s11.jpg',SYSDATE);

INSERT INTO IMAGEBOARD VALUES(
SEQ_IMAGEBOARD.NEXTVAL,'a004','기린',1000,1,'기린 구입','s16.jpg',SYSDATE);

INSERT INTO IMAGEBOARD VALUES(
SEQ_IMAGEBOARD.NEXTVAL,'a005','dog',2300,2,'강아지 구입','s16.jpg',SYSDATE);

INSERT INTO IMAGEBOARD VALUES(
SEQ_IMAGEBOARD.NEXTVAL,'a006','하트',3300,4,'하트 구입','s4.jpg',SYSDATE);

delete from IMAGEBOARD where seq>=3  and seq<=7;


select seq,imageId, imagename,imageprice, imageqty,
       imagecontent, imagepath,
       to_char(logtime,'YYYY.MM.DD')as logtime
from (select rownum rn, aa.*
      from (select * from imageboard order by seq desc) aa)
where rn>=4 and rn<=6;      




















