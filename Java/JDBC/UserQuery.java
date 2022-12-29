package com.sysarc.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserQuery {
	static User obj1 = new User();

	public UserQuery() {
	}

	public boolean register1(User obj1) {
		Connection con = null;
		PreparedStatement pr1 = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SYSARC", "root", "root");
			String str1 = "INSERT INTO REGISTER (NAME,DEPARTMENT,SALARY,JOIN_DATE,MAIL_ID,PASSWORD) VALUES(?,?,?,?,?,?)";
			
			pr1 = con.prepareStatement(str1);
			
			pr1.setString(1, obj1.getName());
			pr1.setString(2, obj1.getDept());
			pr1.setInt(3, obj1.getSal());
			pr1.setString(4, obj1.getDate());
			pr1.setString(5, obj1.getMail());
			pr1.setString(6, obj1.getPass());
			return true;

		} catch (Exception e) {
			System.out.println("Exception Handled ");
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			if (pr1 != null)
				try {
					pr1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			System.out.println("User Registered Successfully");

		}
		return false;
	}

	public int uid() {
		Connection con = null;
		Statement st1 = null;
		ResultSet rs1 = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SYSARC", "root", "root");
			String str1 = "SELECT UID FROM REGISTER";
			st1 = con.createStatement();
			rs1 = st1.executeQuery(str1);
			while (rs1.next()) {
				obj1.setUid(rs1.getInt("UID"));
			}

		} catch (Exception e) {
			System.out.println("Exception Handled ");
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			if (st1 != null)
				try {
					st1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if (rs1 != null)
				try {
					rs1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

		}
		return 0;
	}
}
