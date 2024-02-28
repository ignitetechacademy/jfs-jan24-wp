package com.ignite.explore.java;

public class ExploreValuePassing {

	public static void main(String[] args) {
		Calc calculations = new Calc();
		
		int fValue = 25;
		int sValue = 50;
		
		System.out.println("Second Value 1 : "+sValue);
		int sum = calculations.addition(fValue, sValue);
		
		System.out.println("Sum :  " +sum);
		System.out.println("Second Value 2 : "+sValue);
		
		Data dt = new Data(250, 500);
		System.out.println("DataObj SecondVal 1 : "+dt.secondValue);
		
		int total =calculations.addition(dt);
		System.out.println("Total :  " +total);
		System.out.println("DataObj SecondVal 2 : "+dt.secondValue);
	}
}

class Calc{
	int addition(int first, int second){
		int addedValue =  first + second;
		
		second = 200;
		return addedValue;
	}
	
	int addition(Data data){
		int addedValue =  data.firstValue + data.secondValue;
		
		data.secondValue = 200;
		return addedValue;
	}
}


class Data{
	int firstValue; 
	int secondValue;
	
	Data(int firstValue, int secondValue){
		this.firstValue = firstValue;  	
		this.secondValue = secondValue;
	}
}


