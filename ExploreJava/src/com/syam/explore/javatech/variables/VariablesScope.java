package com.syam.explore.javatech.variables;

public class VariablesScope {
	
	static int balance = 250;

	public static void main(String[] args) {
		System.out.println("Balance : " + balance);
	}
	
	void taxCalculation() {
		System.out.println("Balance 2 : " + balance);
	}

}
