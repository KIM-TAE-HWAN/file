create sequence account_seq
    start with 20230101
    increment by 1
    minvalue 20230101
    maxvalue 999999999999999999999999
    nocache;
    
create table account (
    idx     number              default account_seq.nextval,
    userid  varchar2(20)        not null,
    userpw  varchar2(128)       not null,
    nick    varchar2(20)        not null,
    email   varchar2(80)        not null,
    j_date  date                default sysdate,
    
    constraint account_idx primary key(idx),
    constraint account_userid unique(userid),
    constraint account_nick unique(nick),
    constraint account_email unique(email)
);

create sequence board_seq
    start with 100
    increment by 1
    minvalue 100
    maxvalue 999999999999999999999999
    nocache;
    
create table board (
    idx         number          default board_seq.nextval,
    title       varchar2(150)   default '제목 없음' not null,
    contents    clob            default '내용 없음' not null,
    v_count     number          default 0,
    w_date      date            default sysdate,
    user_idx    number,
    
    constraint board_idx primary key(idx),
    constraint board_uidx foreign key(user_idx) references account(idx) on delete set null
);

-- account 행 추가
insert into 
    account (userid, userpw, nick, email)
    values ('root', 'qwe', '관리자', 'root@naver.com');
insert into 
    account (userid, userpw, nick, email)
    values ('itbank', 'it', '아뱅', 'itbank@naver.com');
insert into 
    account (userid, userpw, nick, email)
    values ('google', '1', '구글', 'goggle@gmail.com');
    
commit;

-- board 행 추가
insert into
    board (title, user_idx)
    values ('관리자에유', '20230101'); 
    
insert into
    board (title, user_idx)
    values ('공지사항', '20230101');

insert into
    board (title, user_idx)
    values ('안녕하세요', '20230102');

insert into
    board (title, user_idx)
    values ('반갑습니다', '20230103'); 

commit;

