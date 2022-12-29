package test1;

import java.util.Scanner;

public class Prog3 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Employee Name,Employee ID,Department,Contact");
		String name = s.nextLine();
		int id = s.nextInt();
		String dept = s.next();
		long contact = s.nextLong();
		Emp obj1 = new Emp(name, id, dept, contact);
		System.out.println(obj1.detailOfEmployee());
	}
}

class Emp {
	String name;
	int id;
	String dept;
	long contact;

	public Emp() {
	}

	public Emp(String name) {
		this.name = name;
	}

	public Emp(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Emp(String name, int id, String dept) {
		this.name = name;
		this.id = id;
		this.dept = dept;
	}

	public Emp(String name, int id, String dept, long contact) {
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.contact = contact;
	}

	public String detailOfEmployee() {
		return "Name: " + name + "\nID: " + id + "\nDEpartment: " + dept + "\nContact Number: " + contact;
	}

}