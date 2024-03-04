package com.ignite.explore.spring.context;

public class QuickCheck {
	public static void main(String[] args) {
		
		Person syam = new Person();
		syam.id = 123;
		syam.name = "Syam Kakumani";
		
		syam.addr.street = "BDS Nagar";
		syam.addr.city = "Bangalore";
		
		System.out.println();
	}
}

class Person{
	int id;
	String name;
	
	Address addr;
}

class Address{
	String street;
	String city;
}
