package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//back controller
@RestController
@RequestMapping(path="api2")
public class ByeController {

	@GetMapping(path="bye")
	public String hello() {
		System.out.println("bye rest api is called");
		return "bye spring boot";
	}
}
