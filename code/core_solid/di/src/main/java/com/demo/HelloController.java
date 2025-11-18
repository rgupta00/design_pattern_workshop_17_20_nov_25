package com.demo;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping(path="hello/{name}")
	public String hello(@PathVariable("name") String name) {
		return "hello :" + name + " current time is "+ LocalDateTime.now();
	}
}
