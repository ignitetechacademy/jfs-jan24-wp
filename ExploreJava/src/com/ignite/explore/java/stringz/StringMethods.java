package com.ignite.explore.java.stringz;

public class StringMethods {

	public static void main(String[] args) {
		
		String name = "Syam Kakumani";
		
		System.out.println(name);
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());

		System.out.println(name.contains("w"));
		
		System.out.println(name.substring(3));
		System.out.println(name.replace("y", "hy"));
	}

}
