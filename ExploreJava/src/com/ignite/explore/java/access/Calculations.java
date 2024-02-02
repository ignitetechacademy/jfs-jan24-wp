package com.ignite.explore.java.access;

public class Calculations {
	
	public static void main(String[] args) {
		System.out.println(div(200, 50));
	}
	
	int add(int first, int second) {
		return first + second;
	}
	
	public int sub(int first, int second) {
		return first - second;
	}
	
	protected int mul(int first, int second) {
		return first * second;
	}
	
	static private int div(int first, int second) {
		return first / second;
	}

}
