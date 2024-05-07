package com.itbank.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.itbank.model.BoardDAO;
import com.itbank.vo.BoardVO;

@Service
public class BoardService {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private BoardDAO dao;
	
	@Value("file:E:\\upload")
	private Resource rs;
	
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
	

	public int insert(BoardVO input, MultipartFile file) throws IOException {
		// 파일 업로드 수행
		String name = file.getOriginalFilename();
		File dir = rs.getFile();
		File dst = new File(dir, name);
		
		file.transferTo(dst);
		// db정보를 저장
		// - 파일 이름과 세션의 계정 번호 추가, session 쓸때 사용 
		input.setUpload(name);
		dao.insert(input);
		
		// 최신 글번호(idx)을 가져와 반환
		
		return dao.selectLast();		
	}
	
	@Transactional(readOnly = true)
	public BoardVO getBoard(int idx) {
		
		return dao.selectOne(idx);
	}




	
}
