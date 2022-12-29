package com.sysarc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;
   
//insert
//update
//delete
public class DML {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Connection con = null;
		Statement st1=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SYSARC", "root", "root");
			
			System.out.println("Enter the number to Delete");
			int no=s.nextInt();
			 String str1="DELETE FROM FRIENDS WHERE NO="+no+";";
			 
			 st1 = con.createStatement();
			 st1.executeUpdate(str1);
		} catch (Exception e) {
			System.out.println("Fix the Error");
		}
	}
}
