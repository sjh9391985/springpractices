package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @reuqestMapping
 * 클래스 + 핸들러
 * @author BIT
 *
 */

@Controller
@RequestMapping("/use"
		+ "r")
public class UserController {
	
	//오버로딩 join
	
	@RequestMapping(value ="/join", method=RequestMethod.GET )
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}
	
//	@ResponseBody
//	@RequestMapping(value ="/join", method=RequestMethod.POST )
//	public String join(UserVo vo) {
//		System.out.println(vo);
//		return "UserController:join";
//	}
	
	@RequestMapping(value ="/join", method=RequestMethod.POST )
	public String join(UserVo vo) {
		System.out.println(vo);
		return "redirect:/";
	}
}
