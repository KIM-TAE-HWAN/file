package com.itbank.Controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.exception.LoginException;
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
		
		mav.addObject("list", as.getAccounts());
		return mav;
	}
	
	@GetMapping("/login")
	public void login() {}
	
//	@PostMapping("/login")
//	public String login(AccountVO user, HttpSession session) {
//		
//		user = as.login(user);
//		
//		if (user != null) {
//			session.setAttribute("user", user);
//		}
//		
//		return "redirect:/";
//	}
	
	@PostMapping("/login")
	public ModelAndView login(AccountVO input, HttpSession session) throws LoginException {
		ModelAndView mav = new ModelAndView();
		
		session.setAttribute("user", as.login(input));
		
		mav.addObject("row", 1);
		mav.addObject("path", "/");
		mav.addObject("msg", "로그인 환영");
		mav.setViewName("message");
		
		return mav;
	}
	
	@GetMapping("/signUp")
	public void signUp() {}
	
	@PostMapping("/signUp")
	public ModelAndView signUp(AccountVO input) throws IOException {
		ModelAndView mav = new ModelAndView("message");
		
		mav.addObject("row", as.addAccount(input));		
		mav.addObject("msg", "회원가입을 환영합니다");
		mav.addObject("path", "/account/login");
		
		return mav;
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		
		return "redirect:/";
	}
	
	@GetMapping("/myPage")
	public void myPage() {}
	
	@PostMapping("/myPage")
	public String myPage(AccountVO input, HttpSession session) throws IOException {
//		System.out.println("upload : " + input.getUpload().getOriginalFilename());
//		System.out.println("userpw : " + input.getUserpw());
		AccountVO user = (AccountVO) session.getAttribute("user");
		input.setIdx(user.getIdx());
		
		as.profileUpdate(input);
		
		return "redirect:/account/logout";
		
	}
	
	@GetMapping("/delete")
	public ModelAndView delete(HttpSession session) throws IOException {
		AccountVO user = (AccountVO) session.getAttribute("user");
		ModelAndView mav = new ModelAndView("message");
		
		mav.addObject("row", as.delAcc(user.getIdx()));
		mav.addObject("msg", "삭제완료");
		mav.addObject("path", "/account/logout");
		
		return mav;
	}
}
