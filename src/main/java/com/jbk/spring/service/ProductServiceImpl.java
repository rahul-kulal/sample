package com.jbk.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.spring.dao.ProductDao;
import com.jbk.spring.model.Product;
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
       private ProductDao dao;
	@Override
	public boolean saveProduct ( Product product) {
		
		 boolean isAdded =dao.saveProduct(product);
	
		return isAdded;
	}

}
