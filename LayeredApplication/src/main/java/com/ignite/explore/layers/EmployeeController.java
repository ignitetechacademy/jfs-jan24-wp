package com.ignite.explore.layers;

public class EmployeeController {
	
	void createEmployee(String fName, String lName){
		System.out.println("First Name : "+fName);
		System.out.println("Second Name : "+lName);
		
		Employee emp = new Employee(fName, lName);
		
		EmployeeService service = new EmployeeService();
		service.generateMail(emp);
	}

}
