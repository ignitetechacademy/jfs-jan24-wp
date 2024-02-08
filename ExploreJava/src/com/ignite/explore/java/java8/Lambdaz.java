package com.ignite.explore.java.java8;

public class Lambdaz {
	public static void main(String[] args) {

		Greet grt = () -> {
			System.out.println("Seasonal Greetings !!");
		};
		grt.greetings();

	}

}

@FunctionalInterface
interface Greet {
	public abstract void greetings();
}
