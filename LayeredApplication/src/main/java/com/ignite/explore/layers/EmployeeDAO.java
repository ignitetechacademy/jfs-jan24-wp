package com.ignite.explore.layers;

public class EmployeeDAO {

	void generateEmpId(Employee employ)
	{
		System.out.println("Id Before : "+employ.getEmpId());
		
		int generatedId = (int) (Math.random() * 10000);
		employ.setEmpId(generatedId);
		
		System.out.println("Id After : "+employ.getEmpId());
	}
}
