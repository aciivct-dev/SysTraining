package day2;

import java.util.Scanner;

//Second Largest
public class Array17 {
	static Scanner s=new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Length of the Array");
		int ar[]=new int[s.nextInt()];
		int max=0,semax=0;
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" Element");
			ar[i]=s.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			if(max<ar[i])
				max=ar[i];
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<max && ar[i]>semax)
			{
				semax=ar[i];
			}
		}
		System.out.println(semax);
		
	}
}
