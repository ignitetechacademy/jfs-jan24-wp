package com.ignite.explore.java.java8.fi;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ExploreFunctionInterface {
	
	public static void main(String[] args) {
		CalcTriple ct = new CalcTriple();
		System.out.println("Std Implementation (class) : " +ct.tripleTheValue(10));
		
		ValueIncrement valIncrement = new ValueIncrement() {
			@Override
			public int tripleIt(int val) {
				return val * val * val;
			}
		};
		System.out.println("Anonymous Impl (interface) : "+valIncrement.tripleIt(10));
		
		ValueIncrement valLambda = (int val) -> {return val * val * val; };
		System.out.println("Lambda Impl : "+valLambda.tripleIt(10));
		
		Function<Integer, Integer> calculateTripleVal = (Integer iValue) -> { return iValue * iValue * iValue;};
		System.out.println("In-built Functional Interface : "+calculateTripleVal.apply(10));
		
		BiFunction<Integer, Integer, Integer> caclSum = (Integer fVal, Integer sVal) -> { return fVal + sVal;};
		System.out.println("BiFunction :: "+caclSum.apply(12, 25));
		
		BiFunction<String, String, String> appedNames = (String fName, String lName) -> {return fName + " " +lName;};
		System.out.println(appedNames.apply("Syam", "Kakumani"));
	}
}

@FunctionalInterface
interface ValueIncrement {
	int tripleIt(int val);
}

class CalcTriple{
	int tripleTheValue(int inputValue){
		return inputValue * inputValue * inputValue;
	}
}
