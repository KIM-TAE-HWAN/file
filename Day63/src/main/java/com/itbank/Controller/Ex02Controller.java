package com.itbank.Controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Ex02Controller {
	
	// 컨트롤러 메서드의 반환형 동작
	// 1. String	: 반환값이 view 이름이 된다
	// 2. void 		: 요청 uri가 view 이름이 된다
	
	@GetMapping("/ex02")
	public void ex02() {}
	
	@PostMapping("/ex02")
	public String ex02(HttpServletRequest request) {
//		try {
//			request.setCharacterEncoding("utf-8");
//		} catch (UnsupportedEncodingException e) {
//			
//		}
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		
//		System.out.println("name : " + name);
//		System.out.println("age : " + age);
		
//		request.setAttribute("name", name);
//		request.setAttribute("age", age);
		String adult = (age >= 19) ? "성인" : "미성년자";
		request.setAttribute("adult", adult);
		
		return "ex02_result";
	}
	
	@GetMapping("/ex03")
	public void ex03() {}
	
	@PostMapping("/ex03")
	public String ex03(Model model, String name, int age) {
		// 파라미터의 이름을 컨트롤러 메서드의 매개변수 이용일 같은 것끼리 저장한다
//		System.out.println("name : " + name);
//		System.out.println("age : " + age);
//		System.out.println("age + 3 : " + (age + 3));
		
		// model : request의 attribute를 대체한다
		String msg = name + "님은 ";
		msg += (age >= 19) ? "성인" : "미성년자";
		
		model.addAttribute("msg", msg);
		
		return "ex03_result";
	}
}
