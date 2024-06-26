package com.itbank.model;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.model.vo.BoardVO;
import com.itbank.model.vo.ReplyVO;

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
	
	@Update("update board set v_count = v_count + 1 where idx = #{idx}")
	int viewUp(int idx);
	
	@Select("select count(*) as total from board")
	int totalBoard();
	
//	@Select("select * from reply_view order by idx desc")
//	List<ReplyVO> selectReplyAll();

	@Select("select * from reply_view where b_idx = #{idx} order by idx desc")
	List<ReplyVO> selectReplyAll(int idx);
	

	int addReply(ReplyVO input);

}