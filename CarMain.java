package com.example;

public class CarMain {
	public static void main(String[] args) {
		Car obj=new Car();
		obj.setCarDetails("Swift", "Maruti",6000000.0);
		String result=obj.getCarDetails();
		System.out.println(result);
		
	}

}
