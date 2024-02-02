package com.ignite.explore.java.exceptions;

public class TaxException extends Exception{

	@Override
	public String getMessage() {
		return "Unable to fetch : tax value from the Government system";
	}
}
