package com.itbank.model;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.itbank.model.vo.BoardVO;

public interface BoardDAO {
	
	@Select("select banner from v$version")
	String test();
	
	List<BoardVO> selectAll(Map<String, Object> param);
	
	int insert(BoardVO input);
	// 여러개의 데이터를 받을땐 vo 혹은 map으로 받아야 한다
	
	@Delete("delete from board where idx = #{idx}")
	int delete(int idx);

	@Select("select * from board_view where idx = #{idx}")
	BoardVO selectOne(int idx);

	int update(BoardVO input);

}