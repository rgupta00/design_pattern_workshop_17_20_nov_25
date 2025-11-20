package com.bankapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.bankapp.dto.Order;
import com.bankapp.services.OrderService;

/*
 * complete Spring Boot local event example for the use case:
--------------------------------------------------------
	Order Created → Order Confirmation → Shipment Processing
 */
@EnableAsync
@SpringBootApplication
public class OrderApplication implements CommandLineRunner{
//
//	@Autowired
//	private OrderService orderService;
//	
	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//orderService.createOrder(new Order(340.00));
	}
}
