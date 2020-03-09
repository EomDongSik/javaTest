1. 회원가입한 정보를 저장할 수 있는 'web_member'테이블을 만드시오.
   컬럼명 : email / pw / tel / address

create table web_member(
email varchar2(100),
pw varchar2(100),
tel varchar2(100),
address varchar2(200)
)


insert into web_member values('엄동식', '1234', '010-4444-5555', '조선대')
insert into web_member values('ht30825', '1234', '010-4444-5555', '조선대')

select * from WEB_MEMBER


