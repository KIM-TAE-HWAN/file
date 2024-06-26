package com.itbank.Day72;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itbank.model.BoardDAO;
import com.itbank.model.vo.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MyBatisTest {
	
	@Autowired
	private BoardDAO dao;
	
	@Test
	public void connection() {
		String banner = "Oracle Database 18c Express Edition Release 18.0.0.0.0 - Production";
		
		assertEquals("접속 성공", banner, dao.test());
	}
	
	@Test
	public void selectTest() {
		Map<String, Object> param = new HashMap<String, Object>();
		
		param.put("type", "title");
		param.put("search", "안녕");
		
		assertNotNull(dao.selectAll(param));
	}

	@Test
	public void insertTest() {
		BoardVO input = new BoardVO();
		
		input.setTitle("mybatis 테스트");
		input.setUser_idx(1001);
		input.setContents("내용 입니다~");
		
		assertEquals("추가 성공", 1, dao.insert(input));
	}
}
