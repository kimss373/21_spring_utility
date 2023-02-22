package com.spring.utility.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/tiles")
public class TilesController {

	@GetMapping("/content1")
	public String content1() {
		return "/content1"; // tiles설정 xml파일 definition속성의 name벨류와 매핑
		
		// 1) definition 속성의 name과 매핑
		// 2) jsp파일경로와 매핑
		// 3) 404 Error
		
	}
	
	@GetMapping("/content2")
	public String content2() {
		return "content2"; // tiles설정 xml파일 definition속성의 name벨류와 매핑
	}
	
	@GetMapping("/content3")
	public ModelAndView content3() {
		return new ModelAndView("a/b/c"); // tiles설정 xml파일 definition속성의 name벨류와 매핑
	}
	
	
}
