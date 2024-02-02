package com.ignite.explore.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExploreGenerics {
	
	public static void main(String[] args) {
		List<String> countries = new ArrayList();
		countries.add("India");
		countries.add("America");
		countries.add("Austratlia");
		
		countries.add("Germany");
		
		Map<Integer, Employee> employees = new HashMap<>();
		employees.put(123, new Employee());
		
	}

}

class Employee{}
