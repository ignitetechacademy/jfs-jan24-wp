package com.ignite.explore.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RetrieveObject {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("RetrieveObject.main()");
		
		ObjectInputStream oInput = new ObjectInputStream(new FileInputStream(
				new File("F:\\training workspace\\Jan24-AS-JFS-7to9\\ExploreJava\\my-files\\andhra-bank.info")));
		
		Bank myBank = (Bank)oInput.readObject();
		System.out.println(myBank);
	}
}
