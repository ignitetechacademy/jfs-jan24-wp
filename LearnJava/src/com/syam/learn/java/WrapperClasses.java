package com.syam.learn.java;

public class WrapperClasses {

	public static void main(String[] args) {

		System.out.println("Input Value : "+args[0]);
		
		int value =  Integer.valueOf(args[0]);
		int selfMultiplication = value * value;
		System.out.println("Value : " + value + "  Exponential value : " + selfMultiplication);
		
		Integer maxWithdrawlAmount = 40000; // 4 byes value
		short withdrawAmount = maxWithdrawlAmount.shortValue();

		Byte departments; // byte
		Short balance = (short) 843222; // short
		Integer networth = 250000000; // int Integer
		Long gdp = 5000000000000l; // long

		Float taxPercentage = 7.25f; // float
		Double totalSales = 2587435.63; // double

		Boolean exists = true; // boolean
		Character gender = 'f'; // char Character
	}
}
