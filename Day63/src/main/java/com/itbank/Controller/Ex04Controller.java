package com.itbank.Controller;

import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.model.vo.PersonVO;

@Controller
@RequestMapping("/ex04")
public class Ex04Controller {
	// ex04 밑으로 다 처리 가능!!!
	@GetMapping("/test1")	// ex04/test1으로 요청이 들어온다
	public void test1() {}	// void는 요청 url가 view 이름이 된다
							// 즉, /WEB-INF/views/ex04/test1.jsp로 포워드
	
	@PostMapping("/test1")
	public String test1(Model model, PersonVO per) {
		
//		System.out.println(per.getName());
//		System.out.println(per.getHeight());
//		System.out.println(per.getBirth());
//		System.out.println(per.getScore());
		
		String msg = 
				per.getName() + " " +
				per.getHeight() + "cm " + 
				per.getBirth() + " " + 
				per.getScore() + "점";
		
		model.addAttribute("msg", msg);
		
		return "ex04/test1_result";
		// 해당 포워드가 되는 파일에 per 정보를 문자열로 한 줄로 저장해서 보낸다
		// 해당 jsp 파일에서 받은 정보를 화면에 출력한다
	}
}
