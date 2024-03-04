package com.ignite.explore.spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectCreationUsingSpring {

	public static void main(String[] args) {
		College clg = new College();
		clg.setName("New Horizon College of Engineering");
		clg.setFounder("Mohan Manghnani");
		clg.setStaretedYear(2001);
		
		//CollegeController con = new CollegeController();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("college-app-config.xml");
		System.out.println("Spring Loaded benas ...");
		
		CollegeController con = appContext.getBean(CollegeController.class);
		con.showInfo(clg);
	}
}
