package com.ignite.explore.java.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExploreDate {

	public static void main(String[] args) {
		
		LocalDate todayDate = LocalDate.now();
		System.out.println(todayDate);
		
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MMMM-yy");
		String fomattedDate = todayDate.format(formatDate);
		System.out.println(fomattedDate);
		
		LocalDateTime todayDatetime = LocalDateTime.now();
		System.out.println(todayDatetime);
	}
}
