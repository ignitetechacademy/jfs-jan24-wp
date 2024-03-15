package com.ignite.explore.spring.context.di;

public class EmployeeController {

	// EmployeeService service = new StandardEmployeeService();
	// EmployeeService service = new SpecialEmployeeService();
	 EmployeeService service ;
	
//	public EmployeeController(EmployeeService service) {
//		System.out.println("Employee Controller :: constructor");
//		this.service = service;
//	}
	 
	 

	void createEmployee(String fName, String lName) {

		Employee emp = new Employee(fName, lName);

		String generatedMail = service.generateEmail(emp);
		System.out.println(generatedMail);
	}

	public void setService(EmployeeService service) {
		this.service = service;
	}
}
