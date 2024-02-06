package com.ignite.explore.java.concurrency;

public class ExploreWaitingState {

	public static void main(String[] args) {
		Object obj = new Object();

		Thread firstThread = new Thread();

		Thread secondThread = new Thread(() -> {
			System.out.println("ExploreWaitingState.main() secondThread");

			synchronized (obj) {
				try {
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			System.out.println("Process Info");
		});

		firstThread.start();
		secondThread.start();

	}
}
