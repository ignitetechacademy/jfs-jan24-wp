package com.ignite.explore.java;

import java.util.Scanner;

public class ExploreInputs {

	public static void main(String[] args) {

		int first = 25; 
		int second = 30;

		int firstTotal = sum(first, second);
		System.out.println("First : " +firstTotal);
		
		int firstInput = Integer.valueOf(args[0]);
		int secondInput = Integer.valueOf(args[1]);
		
		int secondTotal = sum(firstInput, secondInput);
		System.out.println("Second : " +secondTotal);
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstUserInput = userInput.nextInt();
		
		System.out.println("Enter second number");
		int secondUserInput = userInput.nextInt();
	
		int thirdTotal = sum(firstUserInput, secondUserInput);
		System.out.println("Third : " +thirdTotal);
		
	}

	static int sum(int firsrtVal, int secondVal) {
		return firsrtVal + secondVal;
	}

}
