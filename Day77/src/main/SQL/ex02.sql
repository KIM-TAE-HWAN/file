create table account (
idx         number          default account_seq.nextval,
userid      varchar(300)    unique,
userpw      varchar(300)    not null,
nick        varchar(300)    unique,
email       varchar(100)    not null,
j_date      date            default sysdate,

constraint acc_idx primary key (idx)
);

create sequence account_seq
    start with 1001
    increment by 1
    minvalue 1001
    maxvalue 99999999999999999999
    nocache;
    
alter table board add user_idx number;

alter table board add constraint board_user_idx foreign key (user_idx) references account(idx);

insert into account(userid, userpw, nick, email)
        values('root', 'qwe', '관리자', 'root@naver.com');
insert into account(userid, userpw, nick, email)
        values('test1', '1', 'test1', 'test1@naver.com');
insert into account(userid, userpw, nick, email)
        values('test2', '1', 'test2', 'test2@naver.com');   
commit;

update board set user_idx = 1001;

select * from board;

select b.*, a.*
    from board b
    inner join account a
    on b.user_idx = a.idx;

create view board_view as
select b.idx, b.title, a.nick, b.contents,
       b.upload, b.v_count, b.w_date
    from board b
    inner join account a
    on b.user_idx = a.idx
    order by idx;
    
select * from board_view;
