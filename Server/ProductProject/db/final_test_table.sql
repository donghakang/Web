
			
DROP TABLE USERS;
CREATE TABLE USERS (USERID  VARCHAR2(15) PRIMARY KEY, PASS  VARCHAR2(15));

INSERT INTO USERS VALUES('admin','1111');
INSERT INTO USERS VALUES('user01','2222');

select * from users;

DROP TABLE PRODUCT;
CREATE  TABLE  PRODUCT ( 
	NUM  NUMBER(4) PRIMARY KEY, 
	WRITER  VARCHAR2(15),
	INDATE  VARCHAR2(20), 
	NAME VARCHAR2(50),
	DESCRIPTION  VARCHAR2(300));
INSERT INTO PRODUCT VALUES(1,'admin',SYSDATE,'LG INFINIA','Full LED Smart TV');
INSERT INTO PRODUCT VALUES(2,'admin',SYSDATE,'LG OPTIMUS','The Best SmartPhone');
INSERT INTO PRODUCT VALUES(3,'admin',SYSDATE,'LG COOKIE','The Best FeaturePhone');
COMMIT;



select max(num) from product;

insert into product values((select max(num)+1 from product), 'admin', SYSDATE, 'SAMSUNG GALAXY', 'The Newest Smartphone');

select * from product;