package com.solid.pattern.isp.crud;

import com.solid.pattern.isp.repo.OrderRepo;

public class DemoISP {

	public static void main(String[] args) {
		/*
		 * Interface Pollution problem
		 * => classes have empty method implementation
		 * => method throws UnSupporedExceptions
		 * => Method implementation return null or return dummy values
		 * 
		 */
		OrderRepo orderRepo=new OrderRepo();
		
	}
}
