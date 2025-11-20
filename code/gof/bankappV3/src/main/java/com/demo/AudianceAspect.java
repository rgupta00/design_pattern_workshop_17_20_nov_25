package com.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect // aspect =advice + pointcut
public class AudianceAspect {
	//various ann with spring aop
	
	@Around("execution(public String doMagic())")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		long start=System.nanoTime();
		Object result= joinPoint.proceed();
		long end=System.nanoTime();
		System.out.println("time take: "+(end-start)+" ns"+ joinPoint.getSignature().getName());
		return result;
	}
	
	
//	@AfterThrowing(pointcut = "execution(public void doMagic())", throwing = "ex")
//	public void handleProblems(Exception ex) {
//		System.out.println(ex.toString());
//	}
//	
	
//	@AfterReturning("execution(public void doMagic())")
//	public void clapping() {
//		System.out.println("maza aa gaya");
//	}
}



//@Pointcut("execution(public void doMagic())")
//public void foo() {}
//
//@After("foo()")
//public void clapping() {
//	System.out.println("maza aa gaya");
//}
