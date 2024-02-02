package com.ignite.explore.java.apie;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		int openingBalance = 25000;
		
		Summation sum = new Summation();
		int total = sum.addition(25, 53);
		System.out.println(total);
		
		int sumOfThreeValue = sum.addition(10, 20, 40);
		System.out.println(sumOfThreeValue);

	}

}
