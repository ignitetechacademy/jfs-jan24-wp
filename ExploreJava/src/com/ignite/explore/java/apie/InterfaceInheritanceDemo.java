package com.ignite.explore.java.apie;

public class InterfaceInheritanceDemo {
	public static void main(String[] args) {
		Car marutiBaleno = new Car();
		marutiBaleno.defaultDriveMode();
		marutiBaleno.info();
	}
}

class Vehicle{
	String manufacturer; // brand name - Maruti
	String model; // model name - Baleno
}

class Car extends Vehicle implements DriveMode, Dashboard{

	@Override
	public void defaultDriveMode() {
		System.out.println("Hill Assist Mode");
	}

	@Override
	public void info() {
		System.out.println("Car Dashboard : Wood trim dashboard");
	}
}

interface DriveMode{
	void defaultDriveMode();
	void info();
}

interface Dashboard{
	void info();
}
