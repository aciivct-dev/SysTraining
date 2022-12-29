package test1;

import java.util.Scanner;

public class Prog10 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the String for StringBuffer");
		StringBuffer string1 = new StringBuffer(s.nextLine());
		System.out.println("Enter another String to Append with Previous String Buffer");
		StringBuilder string2 = new StringBuilder(s.nextLine());
		string1.append(" " + string2);
		System.out.println(string1);

	}
}
