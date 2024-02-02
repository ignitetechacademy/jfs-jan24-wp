package com.ignite.explore.java.constructors;

public class ExploreKeywors {
	
	public static void main(String[] args) {
		EmployeeDiscount ed = new EmployeeDiscount(25);
		System.out.println(ed);
	}
}

class Discount{
	
	int amount;
	int percentage;
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amountVal) {
		amount = amountVal;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	
}

class EmployeeDiscount extends Discount{

	public EmployeeDiscount(int amt) {
		super();
		super.amount = amt;
	}

	@Override
	public String toString() {
		return "EmployeeDiscount [amount=" + amount + ", percentage=" + percentage + "]";
	}


	
	
}

class PublicDiscount extends Discount{
	
}