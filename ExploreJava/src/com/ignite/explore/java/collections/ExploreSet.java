package com.ignite.explore.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExploreSet {

	public static void main(String[] args) {
		Set<String> vehicles = new TreeSet();
		vehicles.add("Thar");
		vehicles.add("Nexon");
		vehicles.add("Brezza");
		vehicles.add("Innova");
		vehicles.add("Nexon");
		vehicles.add("Nexon");
		System.out.println(vehicles);
		
		Set marks = new HashSet(); 
		marks.add(66); // 1
		marks.add(77); // 2 
		marks.add(88); // 3
		marks.add(95); // 4
		marks.add(68); // 5
		marks.add(88); // 6
		marks.add(77); // 7
		marks.add(55); // 8
		System.out.println("Marks Count : "+marks.size());
		System.out.println(marks);

	}

}
