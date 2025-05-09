package com.example;

public class Product {
	private String productName;
	private int productId;
	private double price;
	public void setProductDetails(String  name,int id,double prc) {
		productName=name;
		productId=id;
		price=prc;	
	}
	public String getProductDetails() {
		return "Product Name:"+productName+"\n Product Id:"+productId+"\n Product Price:"+price;
	}
	

}
