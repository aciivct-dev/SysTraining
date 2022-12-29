 package com.sysarc.jdbc;

import java.sql.*;
import java.util.Scanner;

public class Basic {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Connection con=null;
		Statement st1 =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// ----------------------------------------------------Step1:Register Driver
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SYSARC", "root", "root");// ------Step2:Getting Connection
			System.out.println("Enter the Name,Number,Gender");
			String name=s.nextLine();
			int no=s.nextInt();
			String gender=s.next();
			
			String str1 = "INSERT INTO friends (NAME, No, GENDER) VALUES ('"+name+"',"+no+",'"+gender+"');";// ------------Step3:Issue the SQL Query
			
			st1 = con.createStatement();
			
			st1.execute(str1);// ----------------------------------------------------------------------------Step4:Process the SQL Query
			// execute,executeUpdate,executeQuery.

		} catch (Exception e) {

		}
		finally {
			if (con != null)
				try {
					con.close();
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
 