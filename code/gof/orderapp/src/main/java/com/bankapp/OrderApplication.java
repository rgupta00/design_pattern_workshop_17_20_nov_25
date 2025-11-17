package com.bankapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * complete Spring Boot local event example for the use case:
--------------------------------------------------------
	Order Created → Order Confirmation → Shipment Processing
 */
@SpringBootApplication
public class OrderApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
