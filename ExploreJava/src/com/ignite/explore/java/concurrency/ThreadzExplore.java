package com.ignite.explore.java.concurrency;

import java.util.Arrays;
import java.util.List;

public class ThreadzExplore {

	public static void main(String[] args) {
		List<Company> companies = Arrays.asList(new Company("Ignite Tech", "Bangalore"),
				new Company("Stat Infer", "Vijayawada"), new Company("GBrit", "Chennai"),
				new Company("First Bit", "Pune"), new Company("Supraja Tech", "Hyderabad"));

		System.out.println("No. of Processors avaialble in my system : "+Runtime.getRuntime().availableProcessors());
		System.out.println("------------");
		
		for (Company company : companies) {
			// System.out.println(company.name + " is located in - " + company.location);
			// CompanyInfo.printInfo(company);
			CompanyInfo companyInfo = new CompanyInfo(company);
			companyInfo.start();
		}
	}
}

class CompanyInfo extends Thread{
	Company com;
	
	CompanyInfo(Company comp){
		com = comp;
	}
	
	@Override
	public void run() {
		System.out.println(com.getName() + " is located in - " + com.getLocation());
	}
	
//	static void printInfo(Company company){
//		System.out.println(company.name + " is located in - " + company.location);
//	}
	
}

class Company {
	private String name;
	private String location;

	public Company(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
