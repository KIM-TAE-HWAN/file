package com.itbank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.TestService;

@Controller
public class HomeController {
	
	@Autowired
	private TestService ts;

	
	@GetMapping("/")
	public String hello() {
		return "home";
	}
	
	@GetMapping("/ex01")
	public ModelAndView serviceTest() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("total", ts.total(10));
		mav.setViewName("ex01");
		
		return mav;
	}
	
	@GetMapping("/ex02")
	public ModelAndView ex02() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("ver", ts.test());
		mav.setViewName("ex02");
		
		return mav;
	}
}
