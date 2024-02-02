package com.ignite.explore.java.loops;

public class DoWhileLoop {

	public static void main(String[] args) {

		int[] marks = { 85, 69, 93, 72, 88 };

		int start = 0;

		do {
			System.out.println(marks[start]);
			start++;
		} while (start < marks.length);

	}

}
