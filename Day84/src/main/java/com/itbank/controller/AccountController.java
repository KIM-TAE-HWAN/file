package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.AccountVO;
import com.itbank.service.AccountService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private AccountService as;
	
	@GetMapping()
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", as.getAccs());
		mav.setViewName("account/list");
		
		return mav;
	}
	
	@GetMapping("/login")
	public void login() {}
	
	@PostMapping("/login")
	public String login(AccountVO input, HttpSession session) {
		session.setAttribute("user", as.getAcc(input));
		
		
		return "redirect:/account";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		
		return "redirect:/account";
	}
	
	@GetMapping("/myPage")
	public void myPage() {}
	
	@GetMapping("/signUp")
	public void signUp() {}
	
	@PostMapping("/signUp")
	public String singUp(AccountVO input) {
		as.addAcc(input);		
		
		return "redirect:/account";
	}
}
