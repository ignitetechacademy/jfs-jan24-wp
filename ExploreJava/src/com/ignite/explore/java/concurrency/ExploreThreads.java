package com.ignite.explore.java.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExploreThreads {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Syam", 300000), new Employee("Nischal", 600000),
				new Employee("Muneendra", 900000), new Employee("Pushpa", 1200000), new Employee("Lahari", 1500000),
				new Employee("Dheekshitha", 1800000), new Employee("Dileep", 2400000));

		for (Employee employee : employees) {
//			System.out.println(employee.name + " :: " + (employee.salary / 12) + " (executed thread : "
//					+ Thread.currentThread().getName() + ")");
			
			//new MonthlySalary(employee).start();
			
			// new Thread(new MonthlySalary(employee)).start();
			
			ExecutorService exService = Executors.newFixedThreadPool(4);
		}

	}

}

class MonthlySalary implements Runnable{  //extends Thread {
	Employee empl;

	public MonthlySalary(Employee empl) {
		this.empl = empl;
	}

	@Override
	public void run() {
		// calculate monthly salary
		System.out.println(empl.name + " :: " + (empl.salary / 12) + " (executed thread : "
				+ Thread.currentThread().getName() + ")");
	}
}

class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}
