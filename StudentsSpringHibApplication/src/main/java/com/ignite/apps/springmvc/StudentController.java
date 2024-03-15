package com.ignite.apps.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@Autowired
	StudentDAO dao;

	@RequestMapping("/greetings")
	String greet() {
		System.out.println("Welcome to the Students App ...");

		return "done";
	}

	@RequestMapping("/create/{name}")
	String createStudent(@PathVariable("name") String name) {
		System.out.println("Creating a Student");

		String studentName = name;
		System.out.println("Student Name : " + studentName);
		
		Student std = new Student();
		std.setName(studentName);
		
		dao.saveStudent(std);

		return "creation-success";
	}
}
