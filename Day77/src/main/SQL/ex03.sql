select * from board order by idx desc;
select * from board_view order by idx desc;

update board
    set
        upload = 'apache-tomcat-8.5.99.zip'
    where idx = 181;

commit;

select * from board
    order by idx desc
    offset 0 rows
    fetch first 1 rows only;