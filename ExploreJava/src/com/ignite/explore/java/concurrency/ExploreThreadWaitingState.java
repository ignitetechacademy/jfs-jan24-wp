package com.ignite.explore.java.concurrency;

public class ExploreThreadWaitingState {
	public static void main(String[] args) {

		Object tempResource = new Object();

		Thread producerThread = new Thread(() -> {
			synchronized (tempResource) {
				System.out.println("Connecting to DB, fetching Data");

				try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("Data is retrieved");
				tempResource.notify();
			}
		});

		Thread consumerThread = new Thread(() -> {
			synchronized (tempResource) {
				System.out.println("Read data ...");

				try {
					tempResource.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("Data reading completed");
			}
		});

		consumerThread.start();
		producerThread.start();
	}
}
