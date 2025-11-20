package com.bankapp.services;

import java.util.UUID;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.bankapp.dto.Order;
import com.bankapp.events.OrderCreatedEvent;

@Service
public class OrderService {

	private ApplicationEventPublisher applicationEventPublisher;
	
	public OrderService(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	
	public void createOrder(Order order) {
		String id= UUID.randomUUID().toString();
		order.setOrderId(id);
		System.out.println("order is created : "+ id+": "+ Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		applicationEventPublisher.publishEvent(new OrderCreatedEvent(id));
		
	}
	
}
