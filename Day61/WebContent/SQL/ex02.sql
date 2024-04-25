-- 그냥 board 테이블을 유저에게 보여주면 게시글 작성자를 알 수 없다
-- 그 이유는 idx를 번호로 저장되어 있어서이다
-- 그렇다면 idx로 account 테이블을 참조해서 nick 등의 데이터를 합쳐 보여준다
-- 즉, join이 필요하다

--select b.*, a.*
--    from account a
--    inner join board b
--    on a.idx = b.user_idx;

create view board_view as
select 
    b.idx, b.title, a.nick,
    b.contents, b.v_count, b.w_date
    from account a
    inner join board b
    on a.idx = b.user_idx
    order by idx;
    
select * from board_view order by idx desc;

-- view는 실제 테이블이 아닌 가상 테이블
-- view를 조회할 땐 그때마다 저장한 구문을 실행해서 보여줌
-- 즉, 원문 테이블 내용일 변경되면 view도 내용을 보여준다

update account set nick = '아이티뱅크' where idx = 20230102;

commit;

select * from account;

select * from board;

desc board;
