package com.ignite.explore.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ExploreCallableStatemnt {

	public static void main(String[] args) {

		try {
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/students_data", "postgres",
					"24D@ta30");
			
			CallableStatement cStmt = con.prepareCall("{ ? = call get_name(?) }");
			cStmt.registerOutParameter(1, Types.VARCHAR);
			cStmt.setInt(2, 555);
			cStmt.execute();
			
			System.out.println(cStmt.getString(1));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
