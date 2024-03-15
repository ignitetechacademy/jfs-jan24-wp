package com.ignite.explore.spring.context.di;

public class StandardEmployeeService implements EmployeeService {

	@Override
	public String generateEmail(Employee emp) {
		String email = emp.getFirstName() + "." + emp.getLastName() + "@ignite.com";
		return email;
	}

	public StandardEmployeeService() {
		System.out.println("Spring is calling this constructor");
	}
	
	

}
