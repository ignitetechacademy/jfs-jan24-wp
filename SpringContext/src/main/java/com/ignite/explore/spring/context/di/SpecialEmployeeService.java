package com.ignite.explore.spring.context.di;

public class SpecialEmployeeService implements EmployeeService {

	@Override
	public String generateEmail(Employee emp) {
		String genMail = emp.getFirstName().substring(0,1) + emp.getLastName() + "@ignite.com";
		return genMail;
	}

}
