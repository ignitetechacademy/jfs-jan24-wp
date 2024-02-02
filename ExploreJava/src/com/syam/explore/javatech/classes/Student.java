package com.syam.explore.javatech.classes;

public class Student {

	String name;
	String gender;

	String qualification;
	
	
	// right click -> source -> generate getters, setters & toString
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", qualification=" + qualification + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

}
