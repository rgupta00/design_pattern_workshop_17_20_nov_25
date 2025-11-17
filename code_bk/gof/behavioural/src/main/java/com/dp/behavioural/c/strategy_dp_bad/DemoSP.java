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
class ShoppingCart {

	private List<Integer> items = new ArrayList<>();

	public void addItem(int price) {
		items.add(price);
	}

	public void pay() {
		System.out.println("Default payment – Not implemented");
	}
}

class ShoppingCartPayPal extends ShoppingCart {

	@Override
	public void pay() {
		int total = 0;
		// BAD → we repeat calculation
		System.out.println("Paying with PayPal");
	}
}

class ShoppingCartCod extends ShoppingCart {

	@Override
	public void pay() {
		int total = 0;
		System.out.println("Paying with COD");
	}
}

public class DemoSP {

	public static void main(String[] args) {

	}
}
