package com.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.dto.Order;
import com.bankapp.services.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping(path="order")
	public String placeOrder(@RequestBody Order order) {
		orderService.createOrder(order);
		return "order is booked successfully";
	}
}
