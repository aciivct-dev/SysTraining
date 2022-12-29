package day2;

import java.util.Scanner;

public class TablesMultiplication {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Number to Print Multiplication Tables");
		int num=s.nextInt();
		System.out.println("Enter the limit");
		int end=s.nextInt(),start=1,count=1;
		while(count<=end)
		{
			System.out.println(num+"x"+start+"="+num*start);
			start++;
			count++;
		}
	}
}
