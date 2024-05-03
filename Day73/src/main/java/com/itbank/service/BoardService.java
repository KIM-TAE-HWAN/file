package com.itbank.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.components.Paging;
import com.itbank.model.BoardDAO;
import com.itbank.model.vo.BoardVO;
import com.itbank.model.vo.ReplyVO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;
	
	public String test() {
		
		return dao.test();
	}

	public Map<String, Object> getBoards(Map<String, Object> param) {
		String sint = (String) param.get("page");
		sint = (sint == null) ? "1" : sint;
		
		int reqPage = Integer.parseInt(sint);
		
		Paging pg = new Paging(reqPage, dao.totalBoard());
		param.put("offset", pg.getOffset());
		param.put("boardCount", pg.getBoardCount());
		
		Map<String, Object> result = new HashMap<>();
		
		result.put("pg", pg);
		result.put("list", dao.selectAll(param));
		
		return result;
	}
	
	public int insert(BoardVO input) {
		
		return dao.insert(input);
	}
	
	public int delBoard(int idx) {
		return dao.delete(idx);
	}

	public BoardVO getboard(int idx) {
		return dao.selectOne(idx);
	}

	public int updateBoard(BoardVO input) {
		return dao.update(input);
	}
	
	public int viewUp(int idx) {
		return dao.viewUp(idx);
	}
	
	public int totalBoard() {
		return dao.totalBoard();
	}
	
//	public List<ReplyVO> getReplys() {
//		return dao.selectReplyAll();
//	}
	
	public List<ReplyVO> getReplys(int idx) {
		return dao.selectReplyAll(idx);
	}

	public int replyAdd(ReplyVO input) {
		
		return dao.addReply(input);		
	}
	
	
}
