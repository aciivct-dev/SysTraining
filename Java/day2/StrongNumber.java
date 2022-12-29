package day2;

import java.util.Scanner;

public class StrongNumber {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number to check Strong Number");
		int num = s.nextInt(), copy = num, last, sum = 0;
		while (num > 0) {
			last = num % 10;
			sum += fact(last);
			num /= 10;
		}
		if (copy == sum)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong Number");
	}

	public static int fact(int number) {
		int fact = 1;
		while (number > 0) {
			fact *= number;
			number--;
		}
		return fact;
	}

}
