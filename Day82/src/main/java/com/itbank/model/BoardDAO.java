package com.itbank.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.model.vo.BoardVO;

@Mapper
public interface BoardDAO {
	
	List<BoardVO> selectAll(Map<String, Object> param);

	@Select("select * from board_view where idx = #{idx}")
	BoardVO selectOne(int idx);
	
	@Insert("insert into board(title, contents, user_idx) values(#{title}, #{contents}, #{user_idx})")
	int insert(BoardVO input);
	
	@Delete("delete from board where idx = #{idx}")
	int delete(int idx);
	
	@Update("update board set title = #{title}, contents = #{contents} where idx = #{idx}")
	int update(BoardVO input);
	
	@Update("update board set v_count = v_count + 1 where idx = #{idx}")
	int viewUp(int idx);
	
	int totalBoard(BoardVO input);
	
}
