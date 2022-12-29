package day2;

import java.util.Scanner;
//Ascending
public class Array14 {
static Scanner s=new Scanner (System.in);
public static void main(String[] args) {
	System.out.println("Enter the Length of the Array");
	int ar[]=new int [s.nextInt()];
	for(int i=0;i<ar.length;i++)
	{
		System.out.println("Enter the Array Elements");
		ar[i]=s.nextInt();
	}
	for(int i=0;i<ar.length;i++)
	{
		int temp=0;
		for(int j=i+1;j<ar.length;j++)
		{
			if(ar[i]>ar[j])
			{
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;				
				
			}
		}
	}
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}

}
}
