package com.ignite.explore.java.concurrency;

public class ExploreThreadBlockedState {

	public static void main(String[] args) {
		Object tmp = new Object();

		Thread trOne = new Thread(() -> {
			synchronized (tmp) {
				System.out.println("Accessing Data .... 1");

				try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		trOne.setName("Depoit-Thread");

		Thread trTwo = new Thread(() -> {
			synchronized (tmp) {
				System.out.println("Accesing Data .... 2");
			}

		});
		trTwo.setName("Withdrawl-Thread");

		trOne.start();
		trTwo.start();

	}

}
