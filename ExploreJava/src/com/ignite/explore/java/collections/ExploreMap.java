package com.ignite.explore.java.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class ExploreMap {

	public static void main(String[] args) {
		
		Map<Integer, String> studentMap = new TreeMap();
		studentMap.put(111, "Nischal");
		studentMap.put(33, "Lahiri");
		studentMap.put(222, "Dheekshitha");
		studentMap.put(444, "Dileep");
		
		System.out.println(studentMap);
		System.out.println("Val 1 :" + studentMap.get(111));
		
		studentMap.put(111, "Nischal S");
		System.out.println("Val 2 : " +studentMap.get(111));
		
		System.out.println(studentMap);
		System.out.println(studentMap.get(111));
	}
}
