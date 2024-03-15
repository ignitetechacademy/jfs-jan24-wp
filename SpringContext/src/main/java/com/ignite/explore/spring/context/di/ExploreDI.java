package com.ignite.explore.spring.context.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExploreDI {

	public static void main(String[] args) {
		// Employee App
		
		String firstName = "Girish";
		String lastName = "Kumar";
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ignite-config.xml");
		System.out.println("Spring Container loaded beans");
		
		// EmployeeController empController = new EmployeeController();
		EmployeeController empController = appContext.getBean(EmployeeController.class);
		empController.createEmployee(firstName, lastName);
		
	}
}
