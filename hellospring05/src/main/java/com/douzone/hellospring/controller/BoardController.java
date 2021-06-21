package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

	/**
	 * 
	 * @RequestMapping
	 * 메소드 단독 매핑
	 * 
	 * #author bit-user
	 * 
	 */
	
	@ResponseBody
	@RequestMapping("/board/write")
	public String write() {
		return "BoardController:write";
	}
	
	//request 단독 매핑
	@ResponseBody
	@RequestMapping("/board/view/{no}")
	public String view(@PathVariable("no") Long boardNo) {
		return "BoardController:write(" + boardNo + ")";
	}
	
	
	
	
}
