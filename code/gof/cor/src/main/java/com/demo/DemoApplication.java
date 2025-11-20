package com.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
    public CommandLineRunner logSecurityFilters(FilterChainProxy filterChainProxy) {
        return args -> {
            System.out.println("Active Spring Security Filter Chains:");
            int index = 1;
            for (SecurityFilterChain chain : filterChainProxy.getFilterChains()) {
                System.out.println("\nFilter Chain " + index++ + ": " + chain);
                chain.getFilters().forEach(f -> System.out.println("   ➡ " + f.getClass().getName()));
            }
        };
    }
}
