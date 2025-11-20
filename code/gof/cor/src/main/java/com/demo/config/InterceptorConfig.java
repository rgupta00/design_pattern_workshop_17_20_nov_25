package com.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.demo.interceptor.FirstInterceptor;
import com.demo.interceptor.SecondInterceptor;

@Configuration
@ComponentScan(basePackages = "com.demo")
public class InterceptorConfig implements WebMvcConfigurer{

	@Autowired
	private FirstInterceptor firstInterceptor;
	
	@Autowired
	private SecondInterceptor secondInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(firstInterceptor).order(1);
		registry.addInterceptor(secondInterceptor).order(1);
		
	}
	
	
	
	
}
