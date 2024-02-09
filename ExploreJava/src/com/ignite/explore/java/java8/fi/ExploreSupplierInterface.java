package com.ignite.explore.java.java8.fi;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class ExploreSupplierInterface {

	public static void main(String[] args) {
		Supplier<Integer> bank = () -> {return 250000;};
		System.out.println("Opening Balanace : " +bank.get());
		
		Supplier<String> time = () -> {return LocalDateTime.now().toString();};
		System.out.println(time.get());
		
		
		MyBank myBank = () -> {return 1000000;};
		System.out.println("My Bank Opening Bal : "+myBank.getBalance());
		
	}
}

@FunctionalInterface
interface MyBank{
	int getBalance();
}
