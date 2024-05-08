package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.itbank.model.vo.BoardVO;



public interface BoardDAO {
	
//	@Select("select * from board_view order by idx desc")
//	List<BoardVO> selectAll();
	@Select("select * from board_view order by idx desc offset 0 rows fetch first 10 rows only")
	List<BoardVO> selectAll();
	
	@Insert("insert into board(title, contents, user_idx) values(#{title}, #{contents}, #{user_idx})")
	int insert(BoardVO input);
}
