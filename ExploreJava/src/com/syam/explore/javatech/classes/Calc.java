package com.syam.explore.javatech.classes;

public class Calc {
	
	int addition(int firstValue, int secondValue){
		return firstValue + secondValue;
	}
	
//	int multiplication(int firstValue, int secondValue){
//		return firstValue * secondValue;
//	}
	
	void multiplication(int firstValue, int secondValue){
		System.out.println(firstValue * secondValue);
	}
	
	int subtraction(int first, int second){
		return first - second;
	}
	
	int division(int first, int second){
		return first % second;
	}

}
