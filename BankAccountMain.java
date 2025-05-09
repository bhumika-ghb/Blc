package com.example;

public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount obj=new BankAccount();
		obj.setAccountDetails("Rahul",123456,5000.0);
		String result=obj.getAccountDetails();
		System.out.println(result);
	}

}
