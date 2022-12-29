package test1;

import java.util.Scanner;

public class Prog1 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Employee Name,Employee ID,Department,Contact");

		String name = s.nextLine();
		int id = s.nextInt();
		String dept = s.next();
		long contact = s.nextLong();

		Employee obj1 = new Employee(name, id, dept, contact);
		System.out.println(obj1.detailOfEmployee());
	}
}

class Employee {
	String name;
	int id;
	String dept;
	long contact;

	public Employee() {
	}

	public Employee(String name, int id, String dept, long contact) {
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.contact = contact;
	}

	public String detailOfEmployee() {
		return "Name: " + name + "\nID: " + id + "\nDEpartment: " + dept + "\nContact Number: " + contact;
	}
}
