select * from account order by idx desc;

update account set profile = 0;

commit;

update account set profile = 1 where idx = 1004;

create table test (
    gender varchar2(10) check (gender in ('남','여')) 
);

-- 가장 최근 내용을 출력
select * from account
    order by idx desc 
    offset 0 rows
    fetch first 1 rows only;

select * from account
    order by idx desc;