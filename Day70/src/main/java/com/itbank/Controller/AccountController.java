package com.itbank.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.AccountVO;
import com.itbank.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService as;
	
	@GetMapping("/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("acc", as.getaccounts());
		
		return mav;
	}
	
	@GetMapping("/login")
	public void login() {}
	
	@PostMapping("/login")
	public String login(AccountVO user, HttpSession session) {
		
		user = as.login(user);
		
		if (user != null) {
			session.setAttribute("user", user);
		}
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/myPage")
	public void myPage() {}
	
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/signUp")
	public void signUp() {}
	
	@PostMapping("/signUp")
	public String singUp(AccountVO input) {
		as.addAccount(input);
		
		return "redirect:/account/login";
	}
	
}
