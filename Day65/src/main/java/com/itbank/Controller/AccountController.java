package com.itbank.Controller;

import javax.management.AttributeValueExp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
		@GetMapping("/view")
		public ModelAndView view() {
			
			ModelAndView mav = new ModelAndView();
			
			mav.addObject("ver", as.test());
			mav.addObject("list", as.list());
			mav.setViewName("account/view");
			
			return mav;
		}
		
		@GetMapping("/add")
		public void add() {}
		
		@PostMapping("/add")
		public String add(Model model, AccountVO input) {
			
			int row = as.addAcc(input);
			String msg = (row == 0) ? "등록 실패" : "등록 성공";
			model.addAttribute("msg", "가입 완료");
			
			System.out.println("msg : " + msg);
			// 2. model은 request은 대체한다. 즉, forward에만 유지됨
			
			
			return "redirect:/account/view";
			// 1. view 이름 접두어로 redirect: 를 작성시 리다이렉트 한다
		}
		
		@GetMapping("/delete")
		public void delete() {}
		
		@PostMapping("/delete")
		public String delete(Model model,AccountVO input) {
			// AccountVO input 앞에 @requestParameter 적용해야 버튼 누르면 삭제 완료
			int row = as.delAcc(input);
			String msg = (row == 0) ? "삭제 실패 " : "삭제 성공";
			model.addAttribute("msg", "삭제 완료");
			
			System.out.println("msg : " + msg);
			
			return "redirect:/account/view";
		}
		
		// 해설
		
//		@GetMapping("/delete")
//		public String delete(int idx) {
//			System.out.println(idx);
//			
//			as.delAcc(idx);
//			
//			return "redirect:/account/view";
//		}
		
		// 이렇게 하면 따로 jsp파일 만들필요가 없다!!! - 바로 구문 실행됨
		
		@GetMapping("/update")
		public void update() {}
		
		@PostMapping("/update")
		public String update(Model model,AccountVO input) {
			
			int row = as.upAcc(input);
			String msg = (row == 0) ? "수정 실패 " : "수정 성공";
			model.addAttribute("msg", "수정 완료");
			
			System.out.println("msg : " + msg);
			
			return "redirect:/account/view";
		}
		
		// 해설 
		
//		@GetMapping("update")
//		public ModelAndView update(int idx) {
//			ModelAndView mav = new ModelAndView();
//			
//			mav.addObject("row", as.oneAcc(idx));
//			mav.setViewName("account/add");
//			
//			return mav;
//		}
		
}
