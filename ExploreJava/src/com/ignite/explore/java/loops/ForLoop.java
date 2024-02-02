package com.ignite.explore.java.loops;

public class ForLoop {

	public static void main(String[] args) {

		String[] cities = { "bangalore", "chennai", "delhi" };
		System.out.println(cities);

		for (int index = 0; index < cities.length; index++)
			System.out.println(index+1    + "."  + cities[index] );

		System.out.println("------------------");

		// for ( initialization ; condition ; increment/decrement)

		int end = 5;
		for (int start = 1; start <= end; start++)
			System.out.println(start);

		System.out.println("------------------");

		end = 10;
		for (int start = 50; start >= end; start = start - 10)
			System.out.println(start);

	}

}
