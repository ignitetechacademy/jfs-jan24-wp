package com.ignite.explore.java.exceptions;

public class ExploreThrows {

	public static void main(String[] args) {
		int saleAmount = 300;

		Taxation tax = new Taxation();
		int taxAmount= 0;
		
		try {
			taxAmount = tax.calculateTax(saleAmount);
		}
		catch(TaxException t)
		{
			System.out.println("Exception Occured : "+t.getMessage());
		}
		

		System.out.println("Sale Amount (" + saleAmount + ") Tax Amount (" + taxAmount + ") Total ("
				+ (saleAmount + taxAmount) + ")");

	}

}
