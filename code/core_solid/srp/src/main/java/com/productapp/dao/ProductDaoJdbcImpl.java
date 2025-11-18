package com.productapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.productapp.dao.factories.JdbcConnectionFactory;
import com.productapp.dto.Product;

public class ProductDaoJdbcImpl implements ProductDao {

	private Connection connection;

	public ProductDaoJdbcImpl() {
		connection = JdbcConnectionFactory.getConnection();
	}

	@Override
	public void addProduct(Product product) {
		System.out.println("-----------using jdbc----------");
		try {

			PreparedStatement pstmt = connection.prepareStatement("insert into product(name,price) values(?,?)");

			pstmt.setString(1, product.getName());
			pstmt.setDouble(2, product.getPrice());

			pstmt.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
