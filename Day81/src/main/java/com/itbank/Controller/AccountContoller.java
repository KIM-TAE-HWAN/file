package com.itbank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountContoller {
	
	@Autowired
	private AccountService as;
	
	@GetMapping("/list")
	private ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", as.getAcc());
		
		return mav;
		
	}
}
