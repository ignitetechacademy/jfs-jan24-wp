package com.ignite.explore.java.exceptions;

public class ExploreConversion {

	public static void main(String[] args) {
		
		String value = "175";
		int inputValue = 0;
		
		try {
			inputValue = Integer.valueOf(value);
		}
		catch (Exception e) {
			System.out.println("Unable to convert to number");
		}
		
		
		System.out.println(inputValue + inputValue);
		
	}


}
