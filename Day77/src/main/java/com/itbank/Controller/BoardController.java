package com.itbank.Controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.BoardService;
import com.itbank.service.FileService;
import com.itbank.vo.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	BoardService bs;
	
//	@Autowired
//	FileService fs;
	
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable int idx) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.getBoard(idx));
		mav.setViewName("board/view");
		
		return mav;
	}
	
	@GetMapping("/write")
	public void write() {}
	
//	@Transactional
//	@PostMapping("/write")
//	public String write(BoardVO input, MultipartFile upload) throws IOException {
//		bs.insert(input);
//		
//		fs.fileupload(upload);
//		
//		return "redirect:/";
//	}
	
	@PostMapping("/write")
	public ModelAndView write(BoardVO input, MultipartFile file) throws IOException {
		ModelAndView mav = new ModelAndView();
		
//		System.out.println(input.getTitle());
//		System.out.println(input.getContents());
//		
//		System.out.println("upload : " + file.getOriginalFilename());
		
		int idx = bs.insert(input, file);
		
		mav.addObject("row", 1);		
		mav.addObject("path", "/board/view/" + idx);
		mav.addObject("msg", "작성 완료");
		mav.setViewName("message");
		
		return mav;
		
	}
}
