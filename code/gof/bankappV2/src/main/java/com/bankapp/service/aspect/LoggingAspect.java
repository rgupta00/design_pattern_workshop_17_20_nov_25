package com.bankapp.service.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class LoggingAspect {

	private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	//@Around("execution( * com.bankapp.service.*.*(..))")
	@Around("@annotation(MyLoggable)")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.nanoTime();
		Object result = joinPoint.proceed();
		long end = System.nanoTime();
		logger.info("time take: " + (end - start) + " ns" + joinPoint.getSignature().getName());
		return result;
	}
}
