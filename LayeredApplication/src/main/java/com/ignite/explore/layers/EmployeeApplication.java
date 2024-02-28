package com.ignite.explore.layers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApplication {

	public static void main(String[] args) {
		
		// user input - First Name, Last Name
		String firstName = "Syam";
		String lastName = "Kakumani";
		
		// inverse control, to create a EmployeeController object
		ApplicationContext appContext = new ClassPathXmlApplicationContext("app-objects.xml");
		
		// expected out put - Email Id, Employee Id
		EmployeeController control = appContext.getBean(EmployeeController.class);
		//EmployeeController control = new EmployeeController();
		control.createEmployee(firstName, lastName);

	}

}
