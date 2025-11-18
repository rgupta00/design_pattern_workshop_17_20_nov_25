package com.productapp.controller;

import java.sql.SQLException;

import com.productapp.dto.Product;
import com.productapp.service.ProductService;
import com.productapp.service.ProductServiceImpl;

public class Controller {

	public static void main(String[] args) throws SQLException {
	
		ProductService productService=new ProductServiceImpl();
		productService.addProduct(new Product("thinkig cap v2", 200));
		System.out.println("-------------------");
	}
}
