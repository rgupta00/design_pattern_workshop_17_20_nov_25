package com.bankapp.events;

public class OrderConfirmationEvent{
	private String orderId;

	public OrderConfirmationEvent(String orderId) {
		this.orderId = orderId;
	}
	
	public String getOrderId() {
		return orderId;
	}
}
