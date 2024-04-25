
-- 페이징(paging)을 위한 board 테이블 부풀리기
-- select의 결과를 insert에 사용할 수 있다

insert into board(title, contents, user_idx)
    select title, contents, user_idx from board order by idx;
commit;
   

-- 게시글 개수 확인
select count(*) from board;

-- 페이징에 사용할 sql문
select * from board_view
    order by idx desc
    offset 0 rows
    fetch first 10 rows only;


