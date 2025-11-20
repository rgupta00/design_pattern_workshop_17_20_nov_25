package com.bankapp.services;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.bankapp.events.OrderConfirmationEvent;
import com.bankapp.events.OrderCreatedEvent;
@Async
@Service
public class ConfirmationService {
private ApplicationEventPublisher applicationEventPublisher;
	
	public ConfirmationService(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}
	@EventListener
	public void handleOrder(OrderCreatedEvent createdEvent) {
		System.out.println("sending confirmation for the order : "+ createdEvent.getOrderId()
		+ ": "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		applicationEventPublisher.publishEvent(new OrderConfirmationEvent(createdEvent.getOrderId()));
	}

}
