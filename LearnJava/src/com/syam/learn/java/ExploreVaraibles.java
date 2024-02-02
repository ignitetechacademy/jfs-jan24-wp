package com.syam.learn.java;

public class ExploreVaraibles {
	
	static String fullName;
	
	public static void main(String[] args) {
		String course = "Java FullStack";
		course = course + " - 4 months";
		System.out.println(course);
		

		System.out.println(fullName);
		String location = "Bnagalore";
		
		int contact = 123456789;
	}
	
	void printName() {
		System.out.println(fullName);
	}
	
	void printAnother() {
		System.out.println(fullName);
	}

}
