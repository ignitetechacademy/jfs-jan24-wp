package com.syam.explore.javatech.classes;

public class ClazzExploration {

	public static void main(String[] args) {
		System.out.println(" Execution starts from here ...");

		Student syam = new Student();
		System.out.println(syam);
		
		syam.setName("Syam Kakumani");
		syam.setGender("Male");
		syam.setQualification("Post Graduation");
		System.out.println(syam);
		
		Calc calc = new Calc();
		int sum = calc.addition(123, 94);
		System.out.println("Sum value : "+sum);
		
		calc.multiplication(20, 8);
		
		System.out.println(" Execution completes here ...");
	}

}
