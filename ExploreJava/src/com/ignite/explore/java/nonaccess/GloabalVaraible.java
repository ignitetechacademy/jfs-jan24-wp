package com.ignite.explore.java.nonaccess;

public class GloabalVaraible {

	public static void main(String[] args) {
		Employee syam = new Employee();
		Employee muni = new Employee();
		Employee lahari = new Employee();

	}

}

class Employee {

	static int employeeCounter = 0;

	Employee() {
		employeeCounter = employeeCounter + 1;
		System.out.println(employeeCounter);
	}

	String name;
	String department;

	// setters & getters

}
