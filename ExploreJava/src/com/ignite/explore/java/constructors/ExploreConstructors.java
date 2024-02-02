package com.ignite.explore.java.constructors;

public class ExploreConstructors {
	
	public static void main(String[] args) {
		
		PermanentEmployee syam = new PermanentEmployee();
		System.out.println(syam.toString());
		
		syam.setName("Syam Kakumani");
		syam.setDepartment("Engineering");
		syam.setBonus(25000);
		System.out.println(syam);
		System.out.println("-------------------------");
		
		PermanentEmployee giri = new PermanentEmployee(30000);
		System.out.println(giri);
		
		PermanentEmployee sagar = new PermanentEmployee(50000, "Sagar Moudgal");
		System.out.println(sagar);
		
	}

}
