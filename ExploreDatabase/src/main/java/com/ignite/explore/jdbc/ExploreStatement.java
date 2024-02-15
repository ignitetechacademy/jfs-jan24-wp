package com.ignite.explore.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExploreStatement {

	public static void main(String[] args) {

		System.out.println(" Connect with PostgreSQL database");

		try {

			Class.forName("org.postgresql.Driver");

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/students_data", "postgres",
					"24D@ta30");
			System.out.println("DB connection successful ...");

			Statement stmt = con.createStatement();
			ResultSet results = stmt.executeQuery("SELECT * FROM public.students ORDER BY student_id DESC ");
			System.out.println("Query execution successful ...");
			
			
			while(results.next()) {
				String sname = results.getString("student_name");
				System.out.println(sname);
				
				Integer snumber = results.getInt("student_contact");
				System.out.println(snumber);
				
				System.out.println("-------------");
			}
			
			
		} catch (SQLException e) {
			System.out.println("Unable to connect with the database");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
