package com.ignite.explore.java.concurrency;

public class ThreadLifecycle {

	public static void main(String[] args) {

		Calculate caluc = new Calculate(12);
		caluc.start();
	}

}

class Calculate extends Thread {
	int input;

	Calculate(int ivalue) {
		input = ivalue;
	}

	@Override
	public void run() {
		System.out.println("Double value of (" + input + ") is (" + (input * input) + ")");
	}
}