package com.ignite.explore.java.java8;

public class ExploreLambdaExpression {

	public static void main(String[] args) {
		Calci calSum = new StandardCalculation();
		System.out.println(calSum.cal(10, 20));

		Calci calSub = new Calci() {
			@Override
			public int cal(int firstVal, int secondVal) {
				return firstVal - secondVal;
			}
		};
		System.out.println(calSub.cal(120, 45));

		Calci calMul = (int firstVal, int secondVal) -> {
			return firstVal * secondVal;
		};
		System.out.println(calMul.cal(9, 12));

	}
}

class StandardCalculation implements Calci {

	@Override
	public int cal(int firstVal, int secondVal) {
		return firstVal + secondVal;
	}
}

interface Calci {
	public abstract int cal(int firstVal, int secondVal);
}
