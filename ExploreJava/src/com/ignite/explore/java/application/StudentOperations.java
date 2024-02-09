package com.ignite.explore.java.application;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentOperations {

	Map<Integer, Student> studentMap = new HashMap<>();

	String registerStudent(Student std) {
		studentMap.put(std.contactNumber, std);
		System.out.println(studentMap);

		return "Student Registration successful !!";
	}

	Collection<Student> listStudents() {
		return studentMap.values();
	}
	
	String updateStudentNumber(int existingNumber, int newNumber){
		Student finStudent = studentMap.get(existingNumber);
		finStudent.setContactNumber(newNumber);
		
		return "Number updation successful";
	}
	
	String deleteStudent(int number){
		studentMap.remove(number);
		
		return "Student Deletion success"; 
	}
}
