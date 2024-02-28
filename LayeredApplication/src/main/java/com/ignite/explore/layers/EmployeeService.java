package com.ignite.explore.layers;

public class EmployeeService {

	void generateMail(Employee empl) {

		System.out.println("Email Before : "+empl.getEmailId());
		
		String email = empl.firstName + "." + empl.lastName + "@igniteacademy.com";
		empl.setEmailId(email);
		
		System.out.println("Email After : "+empl.getEmailId());
		
		EmployeeDAO dao =new EmployeeDAO();
		dao.generateEmpId(empl);
	}
}
