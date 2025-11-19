package com.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.demo1"})
public class AppConfig {

	@Bean
	public Car car(Tyre tyre) {
		return new Car(tyre);
	}
	
	@Bean
	public Tyre tyre() {
		return new MrfTyre();
	}
}
