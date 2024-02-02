package com.ignite.explore.java.methods;

public class ExploreMethods {
	
	public static void main(String[] args) {
		
		Greetings greetz = new Greetings();
		greetz.seasonalGreeting();
		
		TimeInfo timez = new TimeInfo();
		String currentTime = timez.getTime();
		System.out.println(currentTime);
		
		UserDetails udetails = new UserDetails();
		udetails.printFullName("Syam", "Kakumani");
		
		TaxCalculation taxValue = new TaxCalculation();
		int taxAmount = taxValue.serviceTax(500);
		System.out.println("Tax to be paid : "+taxAmount);
	}
}
