package day1;

import java.util.Scanner;

public class DuplicateString {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the String");
		String str = s.nextLine();// Ciril
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					System.out.println(ch);
				}
			}
		}
	}
}
