package day1;

import java.util.Scanner;

public class PalindromeNumber {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter any Number");
		int num = s.nextInt(), copy = num, rev = 0;

		while (num > 0) {
			rev = rev * 10 + (num % 10);
			num /= 10;
		}
		if (copy== rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
