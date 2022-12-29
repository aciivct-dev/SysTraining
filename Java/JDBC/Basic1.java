package com.sysarc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Basic1 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs1 = null;
		Statement st1 =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// ----------------------------------------------------Step1:Register Driver

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SYSARC", "root", "root");// ------Step2:Getting Connection

			String str1 = "SELECT NAME FROM FRIENDS;";// ----------------------------------------------------Step3:Issue the SQL Query

			 st1 = con.createStatement();

			rs1 = st1.executeQuery(str1);// ---------------------------------------------------------Step4:Process the SQL Query
			// execute,executeUpdate,executeQuery.
			while (rs1.next()) {
				System.out.println(rs1.getString("NAME"));
			}

		} catch (Exception e) {
			System.out.println("Error Handled");
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			if (rs1 != null)
				try {
					rs1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if(st1!=null)
				try {
					st1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

}
