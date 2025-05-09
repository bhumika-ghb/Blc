package com.example;

public class BookMain {
	public static void main(String[] args) {
		Book obj=new Book();
		obj.setBookDetails("Java Basics","John Doe",450.0);
		String result=obj.getBookDetails();
		System.out.println(result);
	}

}
