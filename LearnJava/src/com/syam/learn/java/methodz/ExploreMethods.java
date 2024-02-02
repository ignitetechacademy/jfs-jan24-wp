package com.syam.learn.java.methodz;

public class ExploreMethods {

	public static void main(String[] args) {
		FewMethods methodsExplore = new FewMethods();
		methodsExplore.greetings();
		methodsExplore.greetLoginUser("Syam");

		String time = methodsExplore.currentTime();
		System.out.println(time);
		
		int value = methodsExplore.selfMultiplication(11);
		System.out.println(value);

		// 10, 15, 30, 50
		int total = methodsExplore.sum(10, 15);
		int finalValue = methodsExplore.sum(total, 30);
		System.out.println(finalValue);
	}

}
