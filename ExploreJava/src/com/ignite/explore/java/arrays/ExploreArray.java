package com.ignite.explore.java.arrays;

public class ExploreArray {

	public static void main(String[] args) {
		
		// collection of batmans  cricket score
		int sachinScore = 25;
		int dhoniScore = 34;
		int kohliScore = 19;
		
		// array declaration
		int scores[] = new int[11];
		scores[0] = 25;
		scores[1] = 34;
		scores[2] = 19;
		scores[3] = 0;
		scores[10] = 0;
		System.out.println("Scores : " +scores[2]);
		
		int[] indiaScores = {25, 34, 19}; 
		System.out.println("India Scores : " +indiaScores[2]);
		
		
		String mon = "Monday";
		String tue = "Tuesday";
		String wed = "Wednesday";
		
		String[] days = {"Monday", "Tuesday", "Wednesday"};
		System.out.println(days);
	}

}
