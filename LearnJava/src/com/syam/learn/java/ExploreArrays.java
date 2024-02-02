package com.syam.learn.java;

public class ExploreArrays {

	public static void main(String[] args) {
		char[] vowels = new char[5];
		vowels[0] = 'a'; //apple - an apple
		vowels[1] = 'e';
		vowels[2] = 'i';
		vowels[3] = 'o';
		vowels[4] = 'u';
		System.out.println(vowels);
		
		int todayStockPrice = 103;
		System.out.println(todayStockPrice);
		
		int[] stockPrice = new int[3];
		stockPrice[0] = 99;
		stockPrice[1] = 84;
		stockPrice[0] = 93;
		System.out.println(stockPrice);
		
		int[] markz = {55, 66, 77};
		int[] marks = new int[3];
		marks[0] = 55;
		marks[1] = 66;
		marks[2] = 77;
	}

}
