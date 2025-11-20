package com.dp.behavioural.c.strategy_dp_bad;

import java.util.ArrayList;
import java.util.List;
/*
 Problems

	You are mixing cart logic + payment logic
	You must create a new subclass for each payment method
	Code duplication
	Violates Open–Closed Principle
	This is exactly why we need Strategy Pattern.
 */
//class ShoppingCart {
//	private List<Integer> items = new ArrayList<>();
//
//	public void addItem(int price) {
//		items.add(price);
//	}
//	public void pay() {
//		System.out.println("Default payment – Not implemented");
//	}
//}
//
//class ShoppingCartPayPal extends ShoppingCart {
//	@Override
//	public void pay() {
//		int total = 0;
//		// BAD → we repeat calculation
//		System.out.println("Paying with PayPal");
//	}
//}
//
//class ShoppingCartCod extends ShoppingCart {
//
//	@Override
//	public void pay() {
//		int total = 0;
//		System.out.println("Paying with COD");
//	}
//}
//seprate what varies
interface PaymentStategy{
	void pay(int amount);
}
class PaypalPaymentStategy implements PaymentStategy{
	private String email;
	
	public PaypalPaymentStategy(String email) {
		this.email = email;
	}
	@Override
	public void pay(int amount) {
		System.out.println("paid "+ amount + "using paypal");
	}	
}
class CreditCardPaymentStategy implements PaymentStategy{
	private String pinNo;
	
	public CreditCardPaymentStategy(String pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public void pay(int amount) {
		System.out.println("paid "+ amount + "using CreditCard");
	}	
}
class CodPaymentStategy implements PaymentStategy{
	private String cashMoney;
	
	public CodPaymentStategy(String cashMoney) {
		this.cashMoney = cashMoney;
	}
	@Override
	public void pay(int amount) {
		System.out.println("paid "+ amount + "using cashMoney");
	}	
}
class ShoppingCart {
	
	private List<Integer> items;
	
	public ShoppingCart() {
		this.items= new ArrayList<>();
	}
	public void addItem(int price) {
		items.add(price);
	}
	public void pay(PaymentStategy paymentStategy) {
		int total=items.stream().mapToInt(Integer::intValue).sum();
		paymentStategy.pay(total);
	}
}



public class DemoSP {
	public static void main(String[] args) {
		ShoppingCart cart=new ShoppingCart();
		cart.addItem(1000);
		cart.addItem(1080);
		
		cart.pay(new CodPaymentStategy("5467"));
		
	}
}
