package test1;

import java.util.Scanner;

public class Prog2 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		user();
	}

	public static void user() throws Exception {
		System.out.println("Welcome To Bank of Sysarc\nPlease Select the Service\n1.Deposite\n2.Withdraw");
		switch (s.nextInt()) {
		case 1: {
			System.out.println("Loading...");
			Thread.sleep(1000);
			System.out.println("Please Enter User Name\nAcc No");
			String name = s.next();
			int acno = s.nextInt();
			Bank obj1 = new Bank(name, acno);
			System.out.println("Enter the Ammount to Deposite");
			obj1.deposite(s.nextInt());
			break;
		}

		case 2: {
			System.out.println("Loading...");
			Thread.sleep(1000);
			System.out.println("Please Enter User Name\nAcc No");
			String name = s.next();
			int acno = s.nextInt();
			Bank obj1 = new Bank(name, acno);
			System.out.println("Enter the Ammount to Withdraw");
			obj1.withdraw(s.nextInt());
			break;
		}

		default:
			System.out.println("Invalid Selection");
			System.out.println("Press '1' to Display Services\nPress '2' to Exit");
			if (s.nextInt() == 1) {
				user();
				break;
			} else if (s.nextInt() == 2) {
				System.out.println("Thank You");
				break;
			} else
				break;
		}
	}
}

class Bank extends Prog2 {
	String name;
	private int acno;
	private int balance = 10000;

	public Bank() {
	}

	public Bank(String name, int acno) {
		this.name = name;
		this.acno = acno;
	}

	public void deposite(int a) {
		depo(a);
	}
	
	public void depo(int deposite)
	{
		this.balance = deposite;
		System.out.println("Ammount deposited Successfully\n Press '1' to Deposite again\n Press any key to Exit");
		if(s.nextInt()==1)
		{
			depo(deposite);
		}
		else
			System.out.println("Thank You\nHave a Plesant Day");
	}
	
	public void withdraw(int a) {
		loop(a);
	}

	void loop(int withdraw) {
		if (balance >= withdraw) {
			System.out.println("Withdraw Successfully\nPress '1' to Show Balance\nPress any key to Exit");
			if (s.nextInt() == 1)
				System.out.println("Current Balance:" + (balance-withdraw));
			else
				System.out.println("Thank You\nHave a Plesant Day");
		} 
		else {
			System.out.println("Insufficient Balance\n Press '1' to ReEnter the Ammount\nPress any key to Exit");
			if (s.nextInt() == 1) {
				loop(withdraw);
			} else
				System.out.println("Terminating Service\nThank You\nHave a Plesant Day");
		}

	}
}
