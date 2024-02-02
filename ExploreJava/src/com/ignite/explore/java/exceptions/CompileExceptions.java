package com.ignite.explore.java.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileExceptions {

	public static void main(String[] args) {

		File personalFile = new File("D:\\training workspace\\Jan24-AS-JFS-7to9\\ExploreJava\\my-files\\info.txt");
		
		try {
			FileReader getInfo = new FileReader(personalFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		try {
			Class.forName("com.oracle.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
