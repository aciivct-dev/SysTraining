package day2;

import java.util.Scanner;

public class Array8 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the length of the Intger Array");
		int ar1[]= new int[s.nextInt()];
		for(int i=0;i<ar1.length;i++)
		{
			System.out.println("Enter the Array Element");
			ar1[i]=s.nextInt();
		}
		for (int i=0;i<ar1.length;i++)
		{
			if(i%2==0)
			System.out.print(ar1[i]);
		}
		
	}

}
