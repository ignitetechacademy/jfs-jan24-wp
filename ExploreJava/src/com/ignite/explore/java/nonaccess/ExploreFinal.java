package com.ignite.explore.java.nonaccess;

public class ExploreFinal {
	
	

	public static void main(String[] args) {
		final int bankBalance = 25000;
		System.out.println("Current Balance : "+bankBalance);
		
		// you ca't reassign value to a final variable
		//bankBalance = bankBalance + 2500;
		System.out.println(bankBalance);
		
		SavingsBankAccount savings = new SavingsBankAccount();
		savings.openingMail();
	}

}

class BankAccount{
	
	final void openingMail(){
		System.out.println("Welcome to - HDFC Bank, thanks for choosing HDFC as your banking partner ");
	}
	
}

class SavingsBankAccount extends BankAccount{
//	@Override
//	void openingMail() {
//		System.out.println("Thanks for choosing Savings Account in HDFC Babk.");
//	}
}
