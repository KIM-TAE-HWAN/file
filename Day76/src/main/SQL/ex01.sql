desc board;

insert into board(nick) values('아뱅');
insert into board(nick) values('아뱅');
insert into board(nick) values('아뱅');

commit;

insert into board(nick) values('아뱅');
commit;
insert into board(nick) values('아뱅');
commit;
insert into board(nick) values('아뱅');
commit;
-- 트랜잭션을 여러번 하는 것은 좋지 않다

select * from board;

commit;

insert into board(title, contents) values('가자', 'ㅁㄴㅇ');
