package com.ignite.explore.java.java8.fi;

import java.util.function.Consumer;

public class ExploreConsumerInterface {

	public static void main(String[] args) {
		
		Consumer<String> greets = (String name) -> {System.out.println("Welcome "+name); };
		greets.accept("Girish");
		
		GreetUSer grtUser = (String inputName) -> {System.out.println("Hello "+inputName);};
		grtUser.grt("Krishna");
	}
}


@FunctionalInterface
interface GreetUSer{
	void grt(String inputName);
}
