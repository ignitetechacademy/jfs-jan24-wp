package com.ignite.explore.java.concurrency;

public class LambdaUsage {
	public static void main(String[] args) {
		Calc cl = new StandardCalculation();
		System.out.println("Additon :"+ cl.add(100, 200));

		Calc anonymousCal = new Calc() {
			public int add(int x, int y) {
				return x + y;
			}
		};
		System.out.println("New Addition : "+anonymousCal.add(100, 200));
		
		Calc lambdaCalc = (first, second) -> { return first + second; };
		System.out.println("Lambda Addition :"+lambdaCalc.add(100, 200));
	}
}

interface Calc {
	int add(int x, int y);
}

class StandardCalculation implements Calc {
	public int add(int fval, int sval) {
		return fval + sval;
	}
}
