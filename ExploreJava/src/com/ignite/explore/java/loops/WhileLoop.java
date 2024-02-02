package com.ignite.explore.java.loops;

public class WhileLoop {

	public static void main(String[] args) {
		
		String[] courses = { "java", "python", "golang", "javascript"};
		System.out.println(courses.length);
		
		int startValue = 0;
		while(startValue < courses.length) {  // 0<4   1<4        
			System.out.println(courses[startValue]);
			startValue++;
		}

	}

}
