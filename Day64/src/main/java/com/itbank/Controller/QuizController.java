package com.itbank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.AccountVO;
import com.itbank.service.QuizService;

@Controller
public class QuizController {
	
	@Autowired				
	private QuizService es;
	
	@GetMapping("/quiz")
	public void quiz() {}
	
	@PostMapping("/quiz")
	public ModelAndView quiz(AccountVO input) {
		
		System.out.println("es : " + es);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", es.login(input));
		mav.setViewName("quiz_result");
		
		return mav;

	}
}
