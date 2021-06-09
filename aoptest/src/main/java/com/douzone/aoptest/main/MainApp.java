package com.douzone.aoptest.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.douzone.aoptest.service.ProductService;
import com.douzone.aoptest.vo.ProductVo;

public class MainApp {
	public static void main(String[] args) {
		
		/* container 생성 */
		ApplicationContext ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		
		ProductService ps = ac.getBean(ProductService.class);
		
		/* AOP가 적용되는 메소드는 find
		 *   */
		ProductVo vo = ps.find("TV"); 
		System.out.println("[main] " + vo);
		
		((AbstractApplicationContext)ac).close();
		
	}

}
