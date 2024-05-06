package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.itbank.vo.BoardVO;

public interface BoardDAO {

	@Select("select banner from v$version")
	String test();

	@Select("select * from board_view order by idx desc")
	List<BoardVO> selectAll();
	
	@Insert("insert into board(nick) values(#{nick})")
	void inserttest(String nick);
	
	@Insert("insert into board(title, contents, user_idx) "
			+ "values(#{title}, #{contents}, #{user_idx})")
	int insert(BoardVO input);
	

}
