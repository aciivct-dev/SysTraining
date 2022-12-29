package com.Library;

import java.sql.*;
import java.util.*;

public class Library {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		System.out.println("1,2,3");
		switch (s.nextInt()) {
		case 1: {
			view();
			break;
		}
		case 2: {
			add();
			break;
		}
		case 3: {
			buy();
			break;
		}
		}

	}

	public static void view() throws Exception {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SYSARC", "root", "root");
		Statement stmt1 = con.createStatement();
		String str1 = "SELECT * FROM LIBRARY;";		
		ResultSet rs1 = stmt1.executeQuery(str1);
		while (rs1.next()) {
			int id = rs1.getInt("ID");
			String bname = rs1.getString("NAME");
			String aname = rs1.getString("AUTHOR");
			int price = rs1.getInt("PRICE");
			int stock = rs1.getInt("COUNT");
			System.out.println(bname + " " + aname + " " + price + " " + stock);
		}
		con.close();
	}

	public static void add() throws Exception {
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/SYSARC", "root", "root");
		Statement stmt1 = con1.createStatement();
		
		System.out.println("Enter the book id");
		int id = s.nextInt();
		System.out.println("Enter the Book NAME");
		String bname = s.next();
		System.out.println("Enter the Author Name");
		String aname = s.next();
		System.out.println("Enter the price");
		int price=s.nextInt();
		System.out.println("Enter the stock");
		int count=s.nextInt();

		String str1 = "INSERT INTO LIBRARY VALUES(?,?,?,?,?)";
		PreparedStatement prstm=con1.prepareStatement(str1);
		prstm.setInt(1, id);
		prstm.setString(2,bname);
		prstm.setString(3, aname);
		prstm.setInt(4, price);
		prstm.setInt(5, count);
		
		prstm.executeUpdate();
		System.out.println("Book Added");
		con1.close();
	}

	public static void buy() throws Exception {
		Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/SYSARC", "root", "root");
		Statement stmt2 = con2.createStatement();
		String str1 = "UPDATE LIBRARY SET COUNT= ";
		stmt2.executeQuery(str1);
		con2.close();
	}
} 
