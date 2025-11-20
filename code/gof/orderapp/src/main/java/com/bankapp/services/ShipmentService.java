package com.bankapp.services;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.bankapp.events.OrderConfirmationEvent;
@Async
@Service
public class ShipmentService {
	@EventListener
	public void handleOrder(OrderConfirmationEvent confirmationEvent) {
		System.out.println("Shipment is started: " + confirmationEvent.getOrderId()+ 
				": "+Thread.currentThread().getName());
	}
}
