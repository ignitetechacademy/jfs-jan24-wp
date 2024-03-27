package com.ignite.spring.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {
	
	@Autowired
	StudentsRepository repo;

	@PostMapping("/create")
	String createStudent(@RequestBody StudentData student) {

		System.out.println(student);
		repo.save(student);
		
		return "TODO - Student Creation";
	}
	
	@GetMapping("/list-students")
	List<StudentData> getStudents(){
		return repo.findAll();
	}
}
