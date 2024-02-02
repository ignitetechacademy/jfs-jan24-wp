package com.ignite.explore.java;

public class LogicalOperators {
	public static void main(String[] args) {
		
		// DMart - first time user, above Rs.1000 purchase - get 25 % discount
		// otherwise 10% discount

		boolean newUser = true;
		int purchaseAmount = 900;
		
		if(newUser && purchaseAmount >= 1000) {
			System.out.println("Eligible for 25% discount");
			// discount calculation logic
		}
		else {
			System.out.println("Eligible for 10 percent discount");
		}
		
		// BookMyShow - eligible for free popocorn - if you got axisbank card / buying 6 or more tickets
		String cardType = "HDFCBankCard";
		int ticketsCount = 2;
		String showDay = "weekday";
		
		if(cardType.equals("AxisBankCard") || ticketsCount >= 6 || showDay.equals("weekday")) {
			System.out.println("You got - Free Popcorn bucket");
		}
		else {
			System.out.println("Btterluck next time !!");
		}
		
		boolean eligible = false;
		System.out.println(!eligible);
		
		if(!eligible) {
			System.out.println("Not Eligible for the offer");
		}

		
	}

}
