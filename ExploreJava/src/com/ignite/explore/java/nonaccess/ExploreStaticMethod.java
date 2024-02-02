package com.ignite.explore.java.nonaccess;

import java.time.LocalDate;

public class ExploreStaticMethod {
	public static void main(String[] args) {
		Calender cal = new Calender();
		System.out.println(cal.getDate());
		
		System.out.println(Calender.getDate());
		
	}

}


class Calender{
	
	static String getDate(){
		return LocalDate.now().toString();
	}
	
}
