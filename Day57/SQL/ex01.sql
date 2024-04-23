create sequence board_seq
    start with 10001
    INCREMENT by 1
    minvalue 10001
    maxvalue 999999999999999999
    nocache;

drop table board;

create table board (
    idx         number         default board_seq.nextval,
    title       varchar2(100)  default '제목없음',
    contents    clob           default '내용없음',
    nick        varchar2(60)   not null,
    view_count  number         default 0,
    w_date      date           default sysdate,
    
    CONSTRAINT board_idx primary key(idx),
    CONSTRAINT board_nick foreign key(nick) references account(nick) on delete cascade   
);