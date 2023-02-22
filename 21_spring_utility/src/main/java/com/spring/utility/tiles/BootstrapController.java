package com.spring.utility.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tiles/bootstrap")
public class BootstrapController {

	@GetMapping("/index")
	public String index() {
		
		return "/bootstrap/index";
	}
	
	
	@GetMapping("/blog")
	public String blog() {
		return "/bootstrap/blog";
	}
	
	@GetMapping("/shop")
	public String shop() {
		return "a";
		
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "/contact";
	}
	
}
