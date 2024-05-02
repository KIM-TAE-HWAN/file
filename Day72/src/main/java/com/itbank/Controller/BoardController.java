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
	public ModelAndView list(@RequestParam Map<String, Object> param) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", bs.getBoards(param));
		
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
	
	@GetMapping("/delete/{idx}")
	public String delete(@PathVariable int idx) {
		bs.delBoard(idx);
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable int idx) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.getboard(idx));
		mav.setViewName("board/view");
		
		return mav;
	}

	@GetMapping("/update/{idx}")
	public ModelAndView update(@PathVariable int idx) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.getboard(idx));
		mav.setViewName("board/add");
		
		return mav;
	}

	@PostMapping("/update/{idx}")
	public String update(BoardVO input) {
		bs.updateBoard(input);
		
		return "redirect:/board/list";
	}
	
}
