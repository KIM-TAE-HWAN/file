package com.itbank.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itbank.vo.PersonVO;

@RestController		// Controller + ResponseBody
@RequestMapping("/ex02")
public class Ex02Controller {
	
	@GetMapping
	public String get() {
		return "Hello Spring";
	}
	
	@GetMapping("/person")
	public PersonVO getPerson() {
		return new PersonVO("홍길동", 20);
	}
	
	@GetMapping("/persons1")
	public List<PersonVO> getPersons1() {
		List<PersonVO> list = new ArrayList<>();
		
		list.add(new PersonVO("홍길동", 30));
		list.add(new PersonVO("이민지", 30));
		list.add(new PersonVO("박수철", 30));
		
		return list;
	}
	
	@GetMapping("/persons2")
	public Map<String, PersonVO> getPersons2() {
		Map<String, PersonVO> map = new HashMap<>();
		
		map.put("1", new PersonVO("홍길동", 30));
		map.put("2", new PersonVO("이민지", 30));
		map.put("3", new PersonVO("박수철", 30));
		
		return map;
	}
	
	@GetMapping("/student")
	public Map<String, Object> getStudent() {
		Map<String, Object> stu = new HashMap<>();
		
		stu.put("name", "김민수");
		stu.put("age", 21);
		stu.put("score", 90);
		stu.put("gender", '남');
		
		return stu;
	}
}
