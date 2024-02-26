package com.ignite.app.students;

public class Student {

	String name;
	int standard;
	int contactNumber;

	public Student(String name, int standard, int contactNumber) {
		super();
		this.name = name;
		this.standard = standard;
		this.contactNumber = contactNumber;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", standard=" + standard + ", contactNumber=" + contactNumber + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

}
