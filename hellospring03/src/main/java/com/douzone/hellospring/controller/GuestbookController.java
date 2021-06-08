package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * RequestMapping
 * 클래스(타입) 단독 매핑
 * @author BIT
 *
 */


//@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {

	
	@ResponseBody
	@RequestMapping
	public String list() {
		return "Guestbookcontroller : list";  //http://localhost:8081/hellospring03/guestbook/lsit
	}
	
	@ResponseBody
	@RequestMapping
	public String delete() {
		return "Guestbookcontroller : delete"; //http://localhost:8081/hellospring03/guestbook/delete
	}
	
}
