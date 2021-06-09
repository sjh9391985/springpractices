package com.douzone.aoptest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect //adviser
@Component //bean 설정
public class MyAspect {
	
										/* where point cut 설정 */
	@Before("execution(public com.douzone.aoptest.vo.ProductVo com.douzone.aoptest.service.ProductService.find(String))")
	public void beforeAdvice() {
		System.out.println("---before Advice---");
	}
							/* 접근지시자와 throws는 생략이 가능*/
	@After("execution(* *..*.service.ProductService.*(..))")
	public void afterAdvice() {
		System.out.println("---after Advice---");
	}

	@AfterReturning("execution(* *..*.ProductService.*(..))")
	public void afterReturningAdvice() {
		System.out.println("---After Returning Advice---");
	}
	
	@AfterThrowing(value="execution(* *..*.*(..))", throwing="ex")
	public void afterThrowingAdvice(Throwable ex) {
		System.out.println("---After Throwing Advice: " + ex + "---");
	}
	
	@Around("execution(* *..*.ProductService.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("---Around Advice---");
		
		/* Before advice */
		System.out.println("@Around(Before) Advice");
		
		/* PointCut Method 실행 */
		// 파라미터 가로채기(바꿔버리기)
		Object[] params = {"Camera"};
		
		Object result = pjp.proceed(params);
		
		//Object result = pjp.proceed();
		
		/* After advice */
		System.out.println("@Around(After) Advice");
		
		return result;
		
	}
}
