package com.bankapp.events;

public class OrderCreatedEvent {
	private String orderId;

	public OrderCreatedEvent(String orderId) {
		this.orderId = orderId;
	}
	
	public String getOrderId() {
		return orderId;
	}
}
