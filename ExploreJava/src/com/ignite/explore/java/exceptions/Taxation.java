package com.ignite.explore.java.exceptions;

public class Taxation {

	int calculateTax(int amount) throws TaxException {
		// get tax percentage
		//int taxPercentage = fetchTaxFromOtherSystem(); 
		//return amount * taxPercentage / 100;

		if (fetchTaxFromOtherSystem() > 0) {
			int taxPercentage = fetchTaxFromOtherSystem();
			return amount * taxPercentage / 100;
		} else {
			throw new TaxException();
		}
		

	}

	int fetchTaxFromOtherSystem() {
		return 0; // connect with government system to get current tax rate
	}

}
