package com.ignite.explore.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sham {

	static Map<Integer, Employ> employees = new HashMap<>();

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter choice : ");
		int no = scnr.nextInt();
		System.out.println(no);

		performAction(no, scnr);
	}

	private static void performAction(int no, Scanner scnr) {
		switch (no) {
		case 1: {
			System.out.println("Adding an Employee");
			addEmployee(scnr);
			break;
		}
		case 2: {
			System.out.println("Retrieving an employee");
			break;
		}
		case 3: {
			System.out.println("Updating an Employee");
			break;
		}
		case 4: {
			System.out.println("Deleting an Employee");
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + no);
		}

	}

	private static void addEmployee(Scanner scnr) {
		System.out.print("Enter Name : ");
		String newEmpName = scnr.next();

		System.out.print("Enter Number : ");
		int newEmpNumber = scnr.nextInt();

		employees.put(newEmpNumber, new Employ(newEmpName, newEmpNumber));
		System.out.println(employees);

		System.out.print("Enter Next Choice : ");
		int nextChoie = scnr.nextInt();
		performAction(nextChoie, scnr);
	}
}

class Employ {
	String name;
	int number;

	public Employ(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + "]";
	}

}
