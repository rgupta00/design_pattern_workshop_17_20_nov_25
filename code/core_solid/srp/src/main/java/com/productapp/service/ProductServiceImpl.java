package com.productapp.service;

import com.productapp.dao.ProductDao;
import com.productapp.dao.ProductDaoHibImpl;
import com.productapp.dao.ProductDaoJdbcImpl;
import com.productapp.dto.Product;
//u need to change service layer is dao is chaing..

public class ProductServiceImpl implements ProductService{

	private ProductDao productDao;
	private ValidationService validationService;
	
	public ProductServiceImpl() {
		productDao=new ProductDaoHibImpl();
		validationService=new ValidationServiceImpl();
	}
	
	@Override
	public void addProduct(Product product) {
		if(validationService.valiation(product)) {
			productDao.addProduct(product);
		}
	}

}
