package com.demo;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		Product product=new Product("think and grow rich",1800.00);
		product.addProduct();
	}
}
