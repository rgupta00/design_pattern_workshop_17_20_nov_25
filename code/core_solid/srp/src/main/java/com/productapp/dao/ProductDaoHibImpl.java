package com.productapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.productapp.dao.factories.JdbcConnectionFactory;
import com.productapp.dto.Product;

public class ProductDaoHibImpl implements ProductDao {

	private Connection connection;

	public ProductDaoHibImpl() {
		connection = JdbcConnectionFactory.getConnection();
	}

	@Override
	public void addProduct(Product product) {
		System.out.println("-----------using hib----------");
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
