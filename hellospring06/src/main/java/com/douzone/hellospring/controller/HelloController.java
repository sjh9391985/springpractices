package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

	@RequestMapping("/hello") //method를 requestMapping로 맵핑시켜야함
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/hello2") //method를 requestMapping로 맵핑시켜야함
	public String hello2(String name) {
		System.out.println(name);
		return "/WEB-INF/views/hello2.jsp";
	}
	
	@RequestMapping("/hello3") //method를 requestMapping로 맵핑시켜야함
	public ModelAndView hello3(String name) {
		ModelAndView mav= new ModelAndView();
		
		mav.addObject("name", name);
		mav.setViewName("/WEB-INF/views/hello3.jsp");
		
		return mav;
	}
	
	@RequestMapping("/hello4") //method를 requestMapping로 맵핑시켜야함
	public String hello4(String name, Model model) {
		
		model.addAttribute("name", name);
		return "/WEB-INF/views/hello4.jsp";
	}
}
