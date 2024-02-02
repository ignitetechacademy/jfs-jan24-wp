package com.syam.learn.java.clazz;

public class ExecutionClass {

	public static void main(String[] args) {
		System.out.println("This is an execution class");
		
		Course java = new Course();
		System.out.println(java);
		
		java.setName("Java Full Stack");
		java.setDuration( (byte)3);
		System.out.println(java);
		
		Course devOps = new Course();
		devOps.setTutor("Hari Kammana");
		
		Calculations calc = new Calculations();
		int discountAmount =  calc.discountCalculation(300, 25);
		System.out.println(discountAmount);
	}
}
