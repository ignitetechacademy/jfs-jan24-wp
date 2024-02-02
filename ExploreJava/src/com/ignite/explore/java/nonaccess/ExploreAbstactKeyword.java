package com.ignite.explore.java.nonaccess;

public class ExploreAbstactKeyword {
	
	public static void main(String[] args) {
		
		Item item = new Item();
		System.out.println(item);
		
		// Product prod = new Product(); 
		// prod.getCost();
		
		// Calender calend = new Calender();
		System.out.println(Calender.getDate());
	}

}

abstract class Product {

	void getProductCost() {
		System.out.println("Product.getProductCost()");
	}
	
	abstract void getCost();
}

class Item {

}
