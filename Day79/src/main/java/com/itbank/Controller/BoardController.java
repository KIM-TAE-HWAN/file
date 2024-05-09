package com.itbank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itbank.model.vo.BoardVO;
import com.itbank.service.BoardService;

/*
	c##user1 board 테이블를 활용한다
*/

@RestController
@CrossOrigin(origins = {"http://192.168.1.1:5500"})
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
	public int addBoard(@RequestBody BoardVO input) {
		
//		System.out.println(input);
//		System.out.println(input.getTitle());
//		System.out.println(input.getContents());
//		System.out.println(input.getUser_idx());
		
		return bs.addBoard(input);
	}
	
	@DeleteMapping("/board")
	public int delBoard(int idx) {
		
		return bs.delBoard(idx);
	}
	
	@PatchMapping("/board")
	public int upBoard(@RequestBody BoardVO input) {	
		// put이나 patch 할때는 @RequestBody 설정해서 raw -> json로 설정해서 작성. postman x-www-form-urlencoded으로는 get/post만 된다
		// @RequestBody 사용시 json 값을 받을 수 있다 post, put, patch	
		return bs.upBoard(input);
	}
}
