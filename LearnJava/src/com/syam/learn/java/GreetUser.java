package com.syam.learn.java;

public class GreetUser {

	public static void main(String[] args) {
		
		String firstName = args[0];
		String lastName = args[1];
		
		String fullName = firstName + " " +lastName;
		
		System.out.println("Welcome to Java !! "+fullName);

	}
	
	void greet() {}
	
	protected int addition() {return 0;}


}
