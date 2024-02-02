package com.ignite.explore.java.apie;

public class OverRidingDemo {

	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.getName();

	}

}

class Computer extends Object{
	void getName() {
		System.out.println("Computer");
	}
}

class Desktop extends Computer{
	@Override
	void getName() {
		System.out.println("Desktop Computer");
	}
}

