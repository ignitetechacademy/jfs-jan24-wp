package com.ignite.explore.java.exceptions;

public class ExploreExceptions {

	public static void main(String[] args) {
		
		try {
		System.out.println(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please provide : a value to the program");
		}
		finally {
			// cleanup mechanisms can be done here
			System.out.println("This always executes");
		}
		
		
		System.out.println("Explore exceptions ");
		int calculatedValue = calculate(10, 20, 30);
		System.out.println(calculatedValue);
	}
	
	
	// 10 + 20 * 30  : 610, 900
	// BODMAS Rule
	static int calculate(int firstValue, int secondValue, int thirdValue){
		return firstValue + secondValue * thirdValue;
	}

}
