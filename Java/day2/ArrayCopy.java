package day2;

import java.util.Scanner;

public class ArrayCopy {
static Scanner s=new Scanner (System.in);
public static void main(String[] args) {
	System.out.println("Enter the Length of the Array");
	int arr1[]=new int[s.nextInt()];
	int arr2[]=new int[arr1.length];
	for(int i=0;i<arr1.length;i++)
	{
		System.out.println("Enter the Array "+(i+1)+" Element");
		arr1[i]=s.nextInt();
		arr2[i]=arr1[i];
	}
	for(int i=0;i<arr1.length;i++)
	{
		System.out.println("Array["+i+"]=["+arr2[i]+"]");
	}
}
}
