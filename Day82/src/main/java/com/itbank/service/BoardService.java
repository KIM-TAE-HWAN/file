package com.itbank.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.components.Paging;
import com.itbank.model.BoardDAO;
import com.itbank.model.vo.BoardVO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;
	
	
	public Map<String, Object> getBoards(Map<String, Object> param, BoardVO input) {
		String sint = (String) param.get("page");
		sint = (sint == null) ? "1" : sint;
		
		int reqPage = Integer.parseInt(sint);
		
		Paging pg = new Paging(reqPage, dao.totalBoard(input));
		param.put("offset", pg.getOffset());
		param.put("boardCount", pg.getBoardCount());
		param.put("type", input.getType());
		param.put("search", input.getSearch());
		
		Map<String, Object> result = new HashMap<>();
		
		result.put("pg", pg);
		result.put("list", dao.selectAll(param));
		
		return result;
	}

	public BoardVO getBoard(int idx) {
		dao.viewUp(idx);
		return dao.selectOne(idx);
	}

	public int insert(BoardVO input) {

		return dao.insert(input);
	}

	public int delete(int idx) {
		
		return dao.delete(idx);
	}

	public int update(BoardVO input) {
		
		return dao.update(input);
	}
}
