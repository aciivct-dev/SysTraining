package day2;

import java.util.Scanner;
//Second Smallest
public class Array19 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the Length of the Array");
		int ar[]=new int[s.nextInt()];
		int ar1[]=new int [ar.length];
		//------------------------------
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Enter the Array Elements");
			ar[i]=s.nextInt();
		}
		//------------------------------removing duplicate
		for(int i=0;i<ar.length;i++)
		{
			int count=0;
			//precheck1
			for(int j=i;j>=0;j--)
			{
				if(ar[i]==ar[j])
					count++;
			}
			//swap array
				if(count==1)
					ar1[i]=ar[i];
		}
		//---------------------------- sorting
		for(int i=0;i<ar1.length;i++)
		{
			int temp=0;
			for(int j=i+1;j<ar1.length;j++)
			{
				if(ar1[i]>ar1[j])
				{
					temp=ar1[i];
					ar1[i]=ar1[j];
					ar1[j]=temp;				
					
				}
			}
			if(ar1[i]!=0)
			{
			System.out.println(ar1[i]+" ");
			}
		}
		//---------------------------------
		System.out.println("Enter n to find nth Smallest Number");
		int n=s.nextInt();
		System.out.println(ar1[n-1]);

	}
}
