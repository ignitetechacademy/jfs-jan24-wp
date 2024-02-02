package com.ignite.explore.java.wrapperclasses;

public class Hello extends Object {
	
	public static void main(String[] args) {
		
		Explore expl = new Explore();
		System.out.println(" Explore Object Val 1 : " + expl);
		System.out.println(" Explore Object Val 2 : " + expl.toString());
		
	}
}


 class Explore extends View{
	 void info() {}
 }
 
 class View extends Object {
	 String details() {
		 return null;
	 }
 }
