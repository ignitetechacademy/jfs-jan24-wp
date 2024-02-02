package com.syam.learn.java.methodz;

import java.time.LocalDateTime;

public class FewMethods extends Object {
	void greetings() {
		System.out.println("Seasonal Greetings !!");
	}

	void greetLoginUser(String name) {
		System.out.println("Welcome, " + name);
	}

	String currentTime() {
		return LocalDateTime.now().toString();
	}

	int selfMultiplication(int first) {
		return first * first;
	}

	int sum(int first, int second) {
		return first + second;
	}

}
