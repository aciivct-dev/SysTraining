package day2;

import java.util.Scanner;

public class Array9 {
static Scanner s=new Scanner (System.in);
public static void main(String[] args) {
	System.out.println("Enter the Length of the Array");
	char str[]=new char[s.nextInt()];
	for(int i=0;i<str.length;i++)
	{
		System.out.println("Enter the Array Elements");
		str[i]=s.next().charAt(0);
	}
	for(int i=0;i<str.length;i++)
	{
		if(i%2==1)
			System.out.println(str[i]+" ");
	}
}
}
