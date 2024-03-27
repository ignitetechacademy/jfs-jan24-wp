package com.ignite.demo.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	// @RequestMapping( name = "/employees" , method = RequestMethod.GET)
	// @RequestMapping("/employees")
	@GetMapping("/employees")

	List<Employee> listEmployees() {

		Employee giri = new Employee(2, "Girish Ch", "Team Lead");
		List<Employee> empList = Arrays.asList(new Employee(1, "Syam Kakumani", "Software Engr"), giri);

		return empList;
	}

	// url /value /value
	@GetMapping("/employee/{eid}/{ename}/{eposition}")
	String createEmployeeUsingpathVariables(@PathVariable("eid") int id, @PathVariable("ename") String name,
			@PathVariable("eposition") String designation) {

		Employee empl = new Employee(id, name, designation);
		System.out.println(empl);

		return "Employee creation successful";
	}

	// url ? k=v & k=v
	@GetMapping("/create-emp")
	String createEmployeeUsingRequestParameters(@RequestParam("empid") int employeeId,
			@RequestParam("empname") String employeeName, @RequestParam("empdes") String employeeDesignation) {

		Employee emp = new Employee(employeeId, employeeName, employeeDesignation);
		System.out.println(emp);

		return "Employee Created !!";
	}

	// @RequestMapping(name = "employee-creation", method = RequestMethod.POST)
	@PostMapping("employee-creation")
	String createEmployeeUsingRequestBody(@Validated @RequestBody Employee emp) {

		System.out.println(emp);
		return " Succesfully Created Employee";
	}

}

class Employee {
	int empId;
	String empName;
	String empDesignation;

	public Employee(int empId, String empName, String empDesignation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesignation=" + empDesignation + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

}
