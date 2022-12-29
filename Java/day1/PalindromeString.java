package day1;

import java.util.Scanner;

public class PalindromeString {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the String");
		String str=s.nextLine();
		String copy="";
		for(int i=str.length()-1;i>=0;i--)
		{
			copy=copy+str.charAt(i);		
		}
		if (copy.equals(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
