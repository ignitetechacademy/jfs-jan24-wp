package com.ignite.explore.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ExplloreTransient {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Bank andhraBank = new Bank();
		andhraBank.setName("Andhra Bank");
		andhraBank.setFounder("Pattabhiram");
		andhraBank.setFoundingYear(1947);
		System.out.println(andhraBank);
		
		ObjectOutputStream oStream = new ObjectOutputStream(new FileOutputStream(new File("F:\\training workspace\\Jan24-AS-JFS-7to9\\ExploreJava\\my-files\\andhra-bank.info")));
		oStream.writeObject(andhraBank);
		
	}

}

class Bank implements Serializable {
	String name;
	transient int foundingYear;
	String founder;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFoundingYear() {
		return foundingYear;
	}

	public void setFoundingYear(int foundingYear) {
		this.foundingYear = foundingYear;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", foundingYear=" + foundingYear + ", founder=" + founder + "]";
	}

	
}
