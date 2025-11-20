package com.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.filters.FirstFilter;
import com.demo.filters.SecondFilter;

@Configuration
@ComponentScan(basePackages = "com.demo")
public class FilterConfig {

    @Bean
     FilterRegistrationBean<FirstFilter> firstFilter(){
    	 FilterRegistrationBean<FirstFilter> registration = new FilterRegistrationBean<>();
    	 registration.setFilter(new FirstFilter());
    	 registration.addUrlPatterns("/api/*");   // apply only to /api/
    	 registration.setOrder(1);
    	 return registration;
    }
    
    @Bean
     FilterRegistrationBean<SecondFilter> secondFilter() {
        FilterRegistrationBean<SecondFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new SecondFilter());
        registration.addUrlPatterns("/*");       // apply to all
        registration.setOrder(2);
        return registration;
    }
}
