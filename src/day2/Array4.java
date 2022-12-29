package day2;

import java.util.Scanner;

public class Array4 {
	static Scanner s=new Scanner (System.in);
	public static void main(String[] args) {
		 System.out.println("Enter the Length of the Array");
			int ar1[]=new int [s.nextInt()];
			int [] copy=new int [ar1.length];
			
			for (int i=0;i<ar1.length;i++)
			{
				System.out.println("Enter the Array Element "+(i+1));
				ar1[i]=s.nextInt();
			}
			for (int i=0;i<ar1.length;i++)
			{
				int count=1;
				for(int j=i+1;j<ar1.length;j++)
				{
					if(ar1[i]==ar1[j])
					{
						count++;
						ar1[j]=-1;
					}
				}
				
				if(ar1[i]!=-1)
					copy[i]=count;				
			}
			for(int i=0;i<copy.length;i++)
			{
				if(copy[i]>0)
				{
					System.out.println(ar1[i]+" is Duplicate");
				}
			}
	}

}
