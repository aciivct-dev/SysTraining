package day1;

import java.util.Scanner;

public class Encap {
	private long acc_no;
	private long contact_no;
	public String name = "";
	public String bank = "";

	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		if (count(acc_no) == 9)
			this.acc_no = acc_no;
		else
			System.out.println("Invalid Account Number");
	}

	public long getContact_no() {
		return contact_no;
	}

	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}

	public static void main(String[] args) {
		Encap obj = new Encap();
		obj.setContact_no(9790613093l);
		obj.setAcc_no(123456789);
		System.out.println(obj.getAcc_no());
		System.out.println(obj.getContact_no());
	}

	public static int count(long a) {
		int count = 0;
		while (a > 0) {
			a /= 10;
			count++;
		}
		return count;
	}
}
