package com.example;

public class ProductMain {
	public static void main(String[] args) {
		Product obj=new Product();
		obj.setProductDetails("Laptop",501,75000.0);
		String result=obj.getProductDetails();
		System.out.println(result);
		
	}

}