package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//back controller
@RestController
@RequestMapping(path="api")
public class HelloController {

	@GetMapping(path="hello")
	public String hello() {
		System.out.println("hello rest api is called");
		return "hello spring boot";
	}
}
