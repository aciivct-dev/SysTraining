package day5;

import java.util.Scanner;

public class ArrayDuplicate {
	static Scanner s=new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Length of the Array");
		int [] ar=new int [s.nextInt()];
		//-----------------------getting input from user
		for (int i=0;i<ar.length;i++)
		{
			System.out.println("Enter the Array "+i+" Element");
			ar[i]=s.nextInt();			
		}
		//------------------------
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
			if(ar[i]==ar[j]){
				
			}
				
			}
		}
		
	}


}
