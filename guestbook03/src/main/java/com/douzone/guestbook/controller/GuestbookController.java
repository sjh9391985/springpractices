package com.douzone.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.guestbook.repository.GuestBookRepository;
import com.douzone.guestbook.vo.GuestBookVo;



@Controller
public class GuestbookController {
	
	//DI 의존성 주입
	@Autowired
	private GuestBookRepository guestBookRepository;
	
	
	//handler 생성
	@RequestMapping("")
	public String index(Model model) {
		
	List<GuestBookVo> list = guestBookRepository.findAll();
	model.addAttribute("list", list);
	return "/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping(value="/delete/{no}", method=RequestMethod.GET)
	public String deleteForm(@PathVariable("no") long no , Model model) {
		model.addAttribute("no",no);
		
		return "/WEB-INF/views/deleteform.jsp";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(GuestBookVo vo) {
		guestBookRepository.insert(vo);
		
		return "redirect:/";
	}
	@RequestMapping(value="/delete/{no}", method=RequestMethod.POST)	
	public String delete(GuestBookVo vo, @PathVariable("no") long no, String password) {
		
		System.out.println(no);
		vo.setNo(no);
		vo.setPassword(password);
		
		guestBookRepository.delete(vo);
		
		return "redirect:/";
	}
	
}
