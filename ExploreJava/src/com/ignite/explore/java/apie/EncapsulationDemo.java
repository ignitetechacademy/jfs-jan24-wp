package com.ignite.explore.java.apie;

public class EncapsulationDemo {

	public static void main(String[] args) {


	}

}


class Employee{
	private String name;
	public String designation;
	protected int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesignation() {
		return designation;
	}
	protected void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public int getId() {
		return id;
	}
}