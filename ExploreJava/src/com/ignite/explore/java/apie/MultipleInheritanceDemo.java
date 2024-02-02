package com.ignite.explore.java.apie;

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		Food myFood = new Food();
		myFood.calaries();
	}
}

class Food extends Cereals{
}


class Fruits{
	void calaries(){
		System.out.println("Fruits Calories");
	}
}


class Cereals{
	void calaries(){
		System.out.println("Cereals Calories");
	}
}



