select idx, userid, nick from account order by idx desc;

insert into board(title, contents, nick) values('안녕하세요', '반갑습니다', '담');
insert into board(nick) values('네버');
insert into board(title, nick) values('안녕하세요', '80');

commit;

select * from board order by idx desc;

select * from board where idx = 10022;

update board
    set view_count = view_count + 1
    where idx = 10022;

insert into board(title, nick, contents) values('쉑','담','살려줘');