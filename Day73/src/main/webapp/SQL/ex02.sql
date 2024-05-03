select idx, userid, nick 
    from account order by idx desc;

insert into 
    reply(b_idx, u_idx, contents)
    values(2156, 20230102, '댓글 구현 중..');
    
insert into 
    reply(b_idx, u_idx, contents)
    values(2156, 20230105, '연습..');

insert into 
    reply(b_idx, u_idx, contents)
    values(2155, 20230105, '우우우우..');
    
select * from reply;

commit;