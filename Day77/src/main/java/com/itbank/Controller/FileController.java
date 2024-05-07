package com.itbank.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.FileService;



@Controller
@RequestMapping("/test")
public class FileController {
	
	@Autowired
	private FileService fs;
	
	@GetMapping("/ex01")
	public void ex01() {}
	
	@PostMapping("/ex01")
	public void ex01(MultipartFile upload, String memo) {
		System.out.println("meno : " + memo);
		
		System.out.println("upload : " + upload);
		System.out.println("이름 1 : " + upload.getName());
		System.out.println("이름 2 : " + upload.getOriginalFilename());
		System.out.println("파일 : " + upload.getContentType());
		System.out.println("크기 : " + upload.getSize());
	}
	
	@GetMapping("/ex02")
	public ModelAndView ex02() throws IOException {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("dir", fs.getDir());
		return mav;
	}
	
	@PostMapping("/ex02")
	public String ex02(MultipartFile upload) throws IOException {
		fs.fileupload(upload);
		
		return "redirect:/test/ex02";
	}
	
}
