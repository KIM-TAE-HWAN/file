package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDAO;
import com.itbank.model.vo.BoardVO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;
	
	public String test() {
		
		return dao.test();
	}

	public List<BoardVO> getboards() {
		
		return dao.selectAll();
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
}
