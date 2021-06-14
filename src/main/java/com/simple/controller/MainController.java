package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//아래 이테이션이 붙은 클래스를 component-scan이 읽어서 0
@Controller
public class MainController {
	
	@RequestMapping("/")
	public String home() {
		
		System.out.println("메인 컨트롤러 실행!");
		
		return "home";
//		return "/WEB-INF/jsp/home.jsp";
	}
 
	
}
