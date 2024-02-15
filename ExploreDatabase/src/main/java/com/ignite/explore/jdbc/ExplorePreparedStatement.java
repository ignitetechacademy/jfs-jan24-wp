package com.ignite.explore.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExplorePreparedStatement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please select the student city : ");
		String userInput = scan.next();

		// connect with database
		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/students_data", "postgres",
					"24D@ta30");

			// execute statement
			PreparedStatement pStmt = con.prepareStatement("SELECT * FROM public.students WHERE city = ? ");
			pStmt.setString(1, userInput);
			ResultSet rSet = pStmt.executeQuery();

			// view results
			while (rSet.next()) {
				System.out.println(rSet.getString("student_name") + " - " + rSet.getString("student_mail"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
