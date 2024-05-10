create sequence account_seq
    start with 1001
    increment by 1
    minvalue 1001
    maxvalue 999999999999999
    nocache;
    
create table account (
    idx     number          default account_seq.nextval,
    userid  varchar2(200)   unique,
    userpw  varchar2(200)   not null,
    nick    varchar2(200)   unique,
    j_date  date            default sysdate,
    
    constraint acc_idx primary key(idx)
);

drop table account;
drop sequence account_seq;

insert into account(userid, userpw, nick)
    values('root', 'qwe', '관리자');
insert into account(userid, userpw, nick)
    values('itbank', 'it', '아이티뱅크');
    
select * from account order by idx desc;

commit;

desc account;

