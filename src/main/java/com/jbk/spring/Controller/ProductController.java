package com.jbk.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.jbk.spring.model.Product;
import com.jbk.spring.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;
	
	
	@PostMapping(value = "/saveProduct")
	public boolean saveProduct(@RequestBody Product product) {

		boolean isAdded=service.saveProduct(product);
		
		return isAdded;
	}

}
