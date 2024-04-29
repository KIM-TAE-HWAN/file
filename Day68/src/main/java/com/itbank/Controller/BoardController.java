package com.itbank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/list")
	private ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", bs.getboards());
		
		return mav;
	}
	
	@GetMapping("/add")
	private void add() {}
	
	@PostMapping("/add")
	private ModelAndView add(BoardVO input) {
		
		ModelAndView mav = new ModelAndView();
		
		int row = bs.insert(input);
		String msg = ( row == 0 ) ? "작성 실패" : "작성 성공";
		
		mav.addObject("row" , row);
		mav.addObject("msg", msg);
		mav.setViewName("message");
		
		return mav;
	}
	
	
}
