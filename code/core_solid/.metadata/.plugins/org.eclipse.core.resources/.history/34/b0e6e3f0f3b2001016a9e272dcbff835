package com.oops.employeemgtsytem;

public class Invoice extends Employee {

	private String regNo;
	private String name;
	private int noOfDays;
	private int ratePerDay;

	public Invoice(int id, String name, double amount, String regNo, int noOfDays, int ratePerDay) {
		super(id, name, amount);
		this.noOfDays = noOfDays;
		this.ratePerDay = ratePerDay;
	}

	@Override
	public double payable() {
		return noOfDays * ratePerDay * 0.7;
	}

}
