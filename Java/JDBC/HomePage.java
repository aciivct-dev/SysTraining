package com.sysarc.user;

import java.util.Scanner;

public class HomePage {
	static Scanner s = new Scanner(System.in);
	static User obj1 = new User();
	static UserQuery obj2 = new UserQuery();

	public static void main(String[] args) throws Exception {

		welcome();
	}

	public static void welcome() throws Exception {
		System.out.println("Welcome to SysArc\n1.New User Registration\n2.Login Existing User");
		switch (s.nextInt()) {
		case 1: {
			reg();
			break;
		}
		case 2: {
			login();
			break;
		}
		default: {
			System.out.println("Invalid Selection\nPress '1' to Main Menu\nPress '0' to Exit");
			if (s.nextInt() == 1)
				welcome();
			else if (s.nextInt() == 0) {
				System.out.println("ThankYou");
				System.exit(0);
			}
			break;
		}
		}
	}

	public static void reg() throws Exception {
		System.out.println("Enter Your Name");
		obj1.setName(s.next());
		
		System.out.println("Enter Your Mail Id");
		obj1.setMail(s.next());
		
		System.out.println("Enter Your Department");
		obj1.setDept(s.next());
		
		System.out.println("Enter Your Salary");
		obj1.setSal(s.nextInt());
		
		System.out.println("Enter Your Joining Date");
		obj1.setDate(s.next());
		
		pass();

		if (obj2.register1(obj1)) {
			System.out.println("Registering User....");
			Thread.sleep(500);
			System.out.println("Press '1' to Show Login Credentials");
			if (s.nextInt() == 1)
				System.out.println(obj1.logCredentials());
		} else
			System.out.println("Registration UnSuccessful");
	}
	public static void pass() throws Exception {
		System.out.println("Set Password above 7 Characters");
		String pass = s.next();
		System.out.println("ReEnter Password");
		String checkpass = s.next();

		if ((pass.equals(checkpass)) && pass.length() > 7) {
			obj1.setPass(checkpass);
			System.out.println("Verifying Password....");
			Thread.sleep(1000);
			System.out.println("Password Verified Successfully");
		} else {
			System.out.println("Password Not Matching \nPress '1' to reEnter Password \n Press '2' to Exit");
			if (s.nextInt() == 1)
				pass();
			else if (s.nextInt() == 2)
				System.exit(0);
		}
	}

	public static void login() {
		System.out.println("Enter Your User ID");

		System.out.println("Enter Your Password");

	}

}
