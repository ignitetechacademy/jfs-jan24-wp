package com.ignite.explore.java.access;

public class ExploreAccess {

	public static void main(String[] args) {
		int firstVal = 200;
		int secondVal = 100;
		
		Calculations calc = new Calculations();
		int subVal = calc.sub(firstVal, secondVal);
		System.out.println("Sub : " +subVal);
		
		int addVal = calc.add(firstVal, secondVal);
		System.out.println("Add : "+addVal);
		
		int mulVal = calc.mul(firstVal, secondVal);
		System.out.println("Mul : "+mulVal);
	}

}
