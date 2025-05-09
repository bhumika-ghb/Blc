package com.example;

public class StudentMain {
	public static void main(String[] args) {
		Student result=new Student();
		result.setStudentDetails("Bhumika",101,85.5);
		String obj=result.getStudentDetails();
		System.out.println(obj);
	}
}
