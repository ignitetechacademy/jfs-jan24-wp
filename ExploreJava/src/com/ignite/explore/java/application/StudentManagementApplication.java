package com.ignite.explore.java.application;

import java.util.Collection;
import java.util.Scanner;

public class StudentManagementApplication {

	static StudentOperations studentCRUD = new StudentOperations();

	public static void main(String[] args) {
		System.out.println("----- Student Management Application -----");

		System.out.println("Please choose the Option (1-create 2-retrieve 3-update 4-delete 0-exit) ");
		Scanner inputScanner = new Scanner(System.in);
		int userSelection = inputScanner.nextByte();

		performAction(userSelection, inputScanner);
	}

	private static void performAction(int userSelection, Scanner inputScanner) {

		switch (userSelection) {
		case 0: {
			System.out.println("Termination the application");
			System.exit(0);
		}
		case 1: {
			System.out.println("Register a student");

			// student registration code (logic) goes here
			System.out.print("Enter Student Name ");
			String inputName = inputScanner.next();

			System.out.print("Enter Student Standara ");
			int inputStandard = inputScanner.nextInt();

			System.out.print("Enter Student Number ");
			int inputNumber = inputScanner.nextInt();
			Student std = new Student(inputName, inputStandard, inputNumber);

			String regResponse = studentCRUD.registerStudent(std);
			System.out.println(regResponse);

			System.out.println("Please choose the Option (1-create 2-retrieve 3-update 4-delete 0-exit) ");
			int nextSelection = inputScanner.nextByte();
			performAction(nextSelection, inputScanner);
		}
		case 2: {
			System.out.println("Retrieve students");

			// student retrieval logic
			Collection<Student> students = studentCRUD.listStudents();
			for (Student student : students)
				System.out.println(student.getName() + " : Contact Number (" + student.getContactNumber() + ")");

			System.out.println("Please choose the Option (1-create 2-retrieve 3-update 4-delete 0-exit) ");
			int nextSelection = inputScanner.nextByte();
			performAction(nextSelection, inputScanner);
		}
		case 3: {
			System.out.println("Update student");
			
			// logic to update the student number
			System.out.print("Provide student number to update ");
			int inputNumber = inputScanner.nextInt();
			
			System.out.print("Provide student updated number ");
			int uptionNumber = inputScanner.nextInt();
			
			String status = studentCRUD.updateStudentNumber(inputNumber, uptionNumber);
			System.out.println(status);

			System.out.println("Please choose the Option (1-create 2-retrieve 3-update 4-delete 0-exit) ");
			int nextSelection = inputScanner.nextByte();
			performAction(nextSelection, inputScanner);
		}
		case 4: {
			System.out.println("Delete student");
			
			// logic to delete the student number
			System.out.print("Provide student number to delete ");
			int inputNumber = inputScanner.nextInt();
			
			studentCRUD.deleteStudent(inputNumber);

			System.out.println("Please choose the Option (1-create 2-retrieve 3-update 4-delete 0-exit) ");
			int nextSelection = inputScanner.nextByte();
			performAction(nextSelection, inputScanner);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + userSelection);
		}

	}

}
