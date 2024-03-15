package com.ignite.explore.spring.context.di;

public class AnotherEmplyeeService implements EmployeeService {

	
	
	public AnotherEmplyeeService() {
		System.out.println("Employee Service :: Another implementation");
	}

	@Override
	public String generateEmail(Employee emp) {
		String genMail = emp.getFirstName() + "_" + emp.getLastName() + "@ignite.com";
		return genMail;
	}

}
