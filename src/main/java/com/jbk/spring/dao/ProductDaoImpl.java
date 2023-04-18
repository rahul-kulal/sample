package com.jbk.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jbk.spring.model.Product;
@Repository
public class ProductDaoImpl implements ProductDao {

	List<Product> list = new ArrayList<>();

	@Override
	public boolean saveProduct(Product product) {
		list.add(product);
		return false;
	}

}
