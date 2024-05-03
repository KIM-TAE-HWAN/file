select * from reply order by idx;

select r.*, a.*
    from reply r
    inner join account a
    on r.u_idx = a.idx
    order by r.idx;

create view reply_view as    
select r.idx, r.b_idx, r.contents, r.w_date, 
       a.idx as a_idx, a.userid, a.nick
    from reply r
    inner join account a
    on r.u_idx = a.idx
    order by r.idx;
-- as .. : 속성 이름 변경

-- 지정 게시글의 댓글 수
select count(*) from reply_view where b_idx = 2156;

-- 지정 게시글의 댓글
select * from reply_view where b_idx = 2156;