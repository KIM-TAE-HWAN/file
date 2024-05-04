package com.itbank.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itbank.model.BoardDAO;
import com.itbank.vo.BoardVO;

@Service
public class BoardService {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private BoardDAO dao;
	
	@Transactional(readOnly = true)
	public List<BoardVO> getBoards() {
		return dao.selectAll();
	}

	public void logTest() {
		logger.error("로그 : error");
		logger.warn("로그 : warn");
		logger.info("로그 : info");
		logger.debug("로그 : debug");
		logger.trace("로그 : trace");
		
	}
	
	@Transactional(rollbackFor = Exception.class)
	public int insertTest() throws Exception {
		dao.inserttest("테스트1");
		dao.inserttest("테스트2");
		
		int n = 1;
		
		if(n == 1) {
			throw new Exception("예외 발생");
		}	
		
		dao.inserttest("테스트3");
		
		return 0;
		
	}



	
}
