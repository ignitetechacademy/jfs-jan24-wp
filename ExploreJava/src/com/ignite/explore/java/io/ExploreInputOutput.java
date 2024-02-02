package com.ignite.explore.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ExploreInputOutput {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader(
				new File("F:\\training workspace\\Jan24-AS-JFS-7to9\\ExploreJava\\my-files\\courses.txt"));

		int readfileCharacter;
		while ((readfileCharacter = fileReader.read()) != -1) {
			System.out.println(Character.toChars(readfileCharacter));
		}

		InputStreamReader ireader = new InputStreamReader(
				new FileInputStream("F:\\training workspace\\Jan24-AS-JFS-7to9\\ExploreJava\\my-files\\info.txt"));
		OutputStreamWriter iwriter = new OutputStreamWriter(new FileOutputStream(
				"F:\\training workspace\\Jan24-AS-JFS-7to9\\ExploreJava\\my-files\\update-info.txt"));

		int readCharacter;
		while ((readCharacter = ireader.read()) != -1) {
			// System.out.println((char) readCharacter);
			System.out.println(Character.toChars(readCharacter));

			iwriter.write(Character.toChars(readCharacter));
		}

		iwriter.close();
	}
}
