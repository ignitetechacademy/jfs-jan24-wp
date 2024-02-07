package com.ignite.explore.java.concurrency;

public class ExploreTimedWaitingState {

	public static void main(String[] args) {
		Thread simpleCheck = new Thread( () -> {
			System.out.println("Ignite Tech Academy (Marathahalli) - Bangalore - India");
			
			try {
				Thread.sleep(25000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Data dispalyed ...");

		});
		simpleCheck.start();
	}
}

//class DisplayData implements Runnable {
//
//	@Override
//	public void run() {
//		System.out.println("Ignite Tech Academy - Bangalore - India");
//		
//		try {
//			Thread.sleep(25000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("Data shown ...");
//
//	}
//
//}
