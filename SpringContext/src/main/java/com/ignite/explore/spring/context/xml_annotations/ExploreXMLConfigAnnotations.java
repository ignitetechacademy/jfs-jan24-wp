package com.ignite.explore.spring.context.xml_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ignite.explore.spring.context.College;
import com.ignite.explore.spring.context.CollegeController;

public class ExploreXMLConfigAnnotations {

	public static void main(String[] args) {

		College clg = new College();
		clg.setName("Atria Institute of Technology");
		clg.setFounder("Sunder Raju");
		clg.setStaretedYear(2000);
		
		//CollegeController con = new CollegeController();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("college-config.xml");
		System.out.println("Spring Loaded benas ...");
		
		CollegeController con = appContext.getBean(CollegeController.class);
		con.showInfo(clg);
	
	}
}
