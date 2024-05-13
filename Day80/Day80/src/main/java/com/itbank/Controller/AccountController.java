package com.itbank.Controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itbank.model.vo.AccountVO;
import com.itbank.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private AccountService as;
	
	@GetMapping("/login")
	public void login() {}
	
	@PostMapping("/login")
	public String login(AccountVO input, HttpSession session) {
		
		input = as.login(input);
		
		if (input != null) {
			session.setAttribute("user", input);
		}
		
		return "redirect:/";
	}
	
	@GetMapping("/signUp")
	public void signUp() {}
	
	@PostMapping("/signUp")
	public String signUp(AccountVO input) {
		
		as.addAcc(input);
		
		return "redirect:/";
	}
	
	@ResponseBody
	@GetMapping("/checkId")
	public int checkId(String userid) {
		// 전달받은 id가 db에 존재하는지 파악
		// 있으면 1, 없으면  0을 반환한다
		System.out.println("userid = " + userid);
		
		return as.checkId(userid);
	}
	
//	@ResponseBody
//	@GetMapping("/ckeckId")
//	public Map<String , Object> checkId(String userid) {
//		
//		Map<String, Object> json = new HashMap<>();
//		
//		json.put("msg", "test입니다");
//		
//		return json;
//	}
	
}
