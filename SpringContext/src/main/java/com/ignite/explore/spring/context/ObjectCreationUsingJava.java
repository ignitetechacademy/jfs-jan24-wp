package com.ignite.explore.spring.context;

public class ObjectCreationUsingJava {

	public static void main(String[] args) {

		College college = new College();
		college.setFounder("Dr. Joseph V G");
		college.setStaretedYear(1992);
		college.setName("Garden City College");

		CollegeController control = new CollegeController();
		control.showInfo(college);

	}
}
