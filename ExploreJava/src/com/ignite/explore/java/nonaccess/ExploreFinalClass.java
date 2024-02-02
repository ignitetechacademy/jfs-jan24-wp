package com.ignite.explore.java.nonaccess;

public class ExploreFinalClass {
	
	public static void main(String[] args) {
		
		String name = "Ignite Tech Academy";
		
		CompanyDetails details = new CompanyDetails();
		details.viewCompanyInfo();
	}

}

final class CompanyDetails {
	String name = "Peppy Infotech";
	String founder = "Syam";
	String headOffice = "Bangalore, India";

	void viewCompanyInfo() {
		System.out.println("Company (" + name + ") started by (" + founder + ") in (" + headOffice + ")");
	}
}

class IgniteTechAcademy{ // extends CompanyDetails{
	
	void igniteLocation(){
		System.out.println("IgniteTechAcademy.igniteLocation()");
	}
	
}
