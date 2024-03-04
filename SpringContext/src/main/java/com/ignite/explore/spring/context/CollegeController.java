package com.ignite.explore.spring.context;

public class CollegeController {

	public void showInfo(College clg) {
		System.out.println("College(" + clg.getName() + ") stareted by - " + clg.getFounder() + "  in ("
				+ clg.getStaretedYear() + ") ");
	}
}
