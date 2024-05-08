package com.itbank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itbank.model.vo.BoardVO;
import com.itbank.service.BoardService;

/*
	c##user1 board 테이블를 활용한다
*/

@RestController	
public class BoardController {
	
	// GET /board 로 요청시 board_view 테이블의 정보를 json으로 모두 반환
	// ※ 확인은 웹 브라우저 혹은 postman으로 전환
	
	@Autowired
	BoardService bs;
	
	@GetMapping("/board")
	public List<BoardVO> getBoard() {

		
		return bs.getBoard();
	}
	
	@PostMapping("/board")
	public int addBoard(BoardVO input) {
		
//		System.out.println(input);
//		System.out.println(input.getTitle());
//		System.out.println(input.getContents());
//		System.out.println(input.getUser_idx());
		
		return bs.addBoard(input);
	}
}
