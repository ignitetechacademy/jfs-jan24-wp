package com.ignite.explore.spring.context.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ignite.explore.spring.context.College;
import com.ignite.explore.spring.context.CollegeController;

public class SpringAnnotationExploration {
	public static void main(String[] args) {
		College clg = new College();
		clg.setName("B.M.S. Institute of Technology ");
		clg.setFounder("Bhusanayana Mukundadas Sreenivasaiah");
		clg.setStaretedYear(2002);

		// CollegeController con = new CollegeController();

		ApplicationContext appContext = new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("Spring Loaded benas using Annotations ...");

		CollegeController con = appContext.getBean(CollegeController.class);
		con.showInfo(clg);
	}
}
