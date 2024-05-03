select * from board_view order by idx;

-- 댓글이 있는 게시글만 inner
select b.*, r.*
    from board_view b
    inner join reply_view r
    on b.idx = r.b_idx
    order by b.idx desc;
    
-- 댓글이 없는 게시글도 left-outer
create view board_reply as
select  b.*, r.idx as r_idx, r.contents as r_contents, 
        r.w_date as r_date, r.a_idx, r.userid, r.nick as r_nick
    from board_view b
    left outer join reply_view r
    on b.idx = r.b_idx
    order by b.idx;

-- 댓글이 있는 게시글만 보여줌     
select idx, title, nick, r_contents, r_nick
    from board_reply 
    where r_idx is not null
    order by idx desc;

-- 댓글이 없는 게시글도 다 보여줌
select idx, title, nick, r_contents, r_nick
    from board_reply order by idx desc;

select count(*) from board_reply where idx = 2156;      