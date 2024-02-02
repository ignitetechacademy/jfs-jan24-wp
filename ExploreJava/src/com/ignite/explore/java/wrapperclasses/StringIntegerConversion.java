package com.ignite.explore.java.wrapperclasses;

public class StringIntegerConversion {

	public static void main(String[] args) {
		
		// would to pass 140 & 530
		
		int age = 35; // 4 byes
		byte personAge = (byte) age; // convert into 2 bytes
		
		Integer empAge = 35; // 4 byes
		byte employeeAge = empAge.byteValue();
		
		
		int firstVal = Integer.valueOf(args[0]) ;
		int secondVal = Integer.valueOf(args[1]);
		
		int total =  firstVal + secondVal;
		System.out.println("Total : "+total);

	}

}
