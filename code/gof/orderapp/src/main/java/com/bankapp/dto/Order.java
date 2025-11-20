package com.bankapp.dto;

public class Order {
	private String orderId;
	private double orderCost;
	
	public Order(double orderCost) {
		this.orderCost = orderCost;
	}
	
	public Order(String orderId, double orderCost) {
		super();
		this.orderId = orderId;
		this.orderCost = orderCost;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public double getOrderCost() {
		return orderCost;
	}
	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderCost=" + orderCost + "]";
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
