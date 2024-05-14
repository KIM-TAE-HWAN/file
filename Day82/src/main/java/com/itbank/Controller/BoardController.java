package com.itbank.Controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.BoardVO;
import com.itbank.service.BoardService;


@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService bs;
	
	@GetMapping("/list")
	public ModelAndView list(@RequestParam Map<String, Object> param, BoardVO input) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("map", bs.getBoards(param, input));
		mav.setViewName("board/list");
		
		return mav;
	}
	
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable("idx") int idx) {
		// view?idx=.... 하면 getmapping의 주소에 {idx} 안해도 됨
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.getBoard(idx));
		mav.setViewName("board/view");
		
		return mav;	
	}
	
	@GetMapping("/add")
	public void add() {}
	
	@PostMapping("/add")
	public String add(BoardVO input) {
		bs.insert(input);
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/delete/{idx}")
	public String delete(@PathVariable("idx") int idx) {
		bs.delete(idx);

		return "redirect:/board/list";
	}
	
	@GetMapping("/update/{idx}")
	public ModelAndView update(@PathVariable("idx") int idx) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.getBoard(idx));
		mav.setViewName("board/add");
		
		return mav;
	}

	@PostMapping("/update/{idx}")
	public String update(BoardVO input) {
		bs.update(input);
		
		return "redirect:/board/list";
	}
	
	
}
