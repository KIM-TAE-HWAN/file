package com.itbank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.BoardVO;
import com.itbank.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService bs;
	
	@GetMapping("/write")
	private void write() {}
	
	@PostMapping("/write")
	private ModelAndView write(BoardVO input) {
		
		ModelAndView mav = new ModelAndView();
		
		int row = bs.addWrite(input);
		String msg = ( row == 0 ) ? "작성 실패" : "작성 성공";
		
		mav.addObject("row" , row);
		mav.addObject("msg", msg);
		mav.setViewName("message");
		
		return mav;
	}
	
	// spring은 url에 작성된 내용도 파라미터로 받아 처리 가능
	// - url 중간에 있는 값도 받아서 처리 가능
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable int idx) {
		
		ModelAndView mav = new ModelAndView();
		
		// mav.addObject("row", bs.getBoard(idx));
		mav.addObject("row", bs.getBoard(idx, true));
		mav.setViewName("board/view");
		
		return mav;
	}
	
	
	@GetMapping("/delete/{idx}")
	public ModelAndView delete(@PathVariable int idx) {
		
		ModelAndView mav = new ModelAndView();
		
		int row = bs.delBoard(idx);
		String msg = (row == 0) ? "삭제 실패 " : "삭제 성공";
		
		mav.addObject("row", row);
		mav.addObject("msg", msg);
		mav.setViewName("message");
		
		System.out.println("msg : " + msg);
		
		return mav;
	}
	
	@GetMapping("/update/{idx}")
	public ModelAndView update(@PathVariable int idx) {
		ModelAndView mav = new ModelAndView();
		
		// mav.addObject("row", bs.getBoard(idx));
		mav.addObject("row", bs.getBoard(idx , false));
		mav.setViewName("board/write");
		
		return mav;
	}
	
	@PostMapping("/update/{idx}")
	public ModelAndView update(BoardVO input) {
		ModelAndView mav = new ModelAndView();

		int row = bs.upBoard(input);
		String msg = row == 0 ? "수정 실패" : "수정 성공";
//		System.out.println("idx : " + input.getIdx());
//		System.out.println("title : "+ input.getTitle());
//		System.out.println("contents : " + input.getContents());
		
		mav.addObject("row", row);
		mav.addObject("msg", msg);
		mav.setViewName("message");
		
		return mav;
	}
}
