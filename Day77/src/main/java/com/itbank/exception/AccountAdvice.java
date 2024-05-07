package com.itbank.exception;


import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice(basePackages = {"com.itbank.Controller"})
public class AccountAdvice {

	@ExceptionHandler(LoginException.class)
	public ModelAndView loginEx(LoginException e) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", 0);
		mav.addObject("msg", e.getMessage());
		mav.setViewName("message");
		
		return mav;
	}
	// 예외 발생이 되지 않아 일부러 예외를 발생시키기 위해 AccountService에 예외를 발생시킨다
	
	@ExceptionHandler(DuplicateKeyException.class)
	public ModelAndView uniqueEx() {
		ModelAndView mav = new ModelAndView("message");
		
		mav.addObject("row", 0);
		mav.addObject("msg", "id/nick이 중복됩니다");
		
		return mav;
	}
	// sql 구문이 잘못 기입되면 자동적으로 예외가 발생되기 때문에 일부러 예외를 따로 만들지 않는다 
}
