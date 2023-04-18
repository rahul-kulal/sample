package com.jbk.spring.model;

public class Product {  //made pojo class without connected to database called model class
	
	private int productId;
	private String productName;
	private int productQty;
	private double productPrice;
	
public Product() {
	// TODO Auto-generated constructor stub
}

public Product(int productId, String productName, int productQty, double productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productQty = productQty;
	this.productPrice = productPrice;
}

public int getProductId() {
	return productId;
}

public void setProductId(int productId) {
	this.productId = productId;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public int getProductQty() {
	return productQty;
}

public void setProductQty(int productQty) {
	this.productQty = productQty;
}

public double getProductPrice() {
	return productPrice;
}

public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}

@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productQty=" + productQty
			+ ", productPrice=" + productPrice + "]";
}

}
