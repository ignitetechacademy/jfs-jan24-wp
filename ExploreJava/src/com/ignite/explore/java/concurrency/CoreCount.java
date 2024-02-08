package com.ignite.explore.java.concurrency;

public class CoreCount {

	public static void main(String[] args) {
		
		System.out.println("Initial thread name : " +Thread.currentThread().getName());

		int pcount = Runtime.getRuntime().availableProcessors();
		System.out.println("Processors in my machine : "+pcount);
		
		Thread.currentThread().setName("explore-concurrency-ignite");
		System.out.println("Udated thread name : " +Thread.currentThread().getName());
	}

}
