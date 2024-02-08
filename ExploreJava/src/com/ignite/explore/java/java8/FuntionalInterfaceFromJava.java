package com.ignite.explore.java.java8;

import java.util.function.Function;

public class FuntionalInterfaceFromJava {

	public static void main(String[] args) {

		Function<Integer, Integer> calc = (val) -> val * val;
		int calculatedVal = calc.apply(12);
		System.out.println(calculatedVal);

		NewCalc newc = (val) -> {
			return val * val;
		};
		int newVal = newc.cal(12);
		System.out.println(newVal);

	}
}

interface NewCalc {
	int cal(int value);
}
