package day2;

import java.util.Scanner;

//count of words
public class String3 {
	static Scanner s = new Scanner(System.in);

public static void main(String[] args) {
	System.out.println("Enter the String");
	String str=s.nextLine();
	int count=1;
	for(int i=0;i<str.length();i++)
	{
	if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
		count++;
	}
	System.out.println("Count of Words is "+count);
}
}
