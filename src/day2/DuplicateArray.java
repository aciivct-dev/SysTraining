package day2;

import java.util.Scanner;

public class DuplicateArray {
static Scanner s=new Scanner (System.in);
public static void main(String[] args) {
	int a[]={12,13,22,28,03,21,18,18,18,18};
	for(int i=0;i<a.length;i++)
	{
		int count=0;
		for(int j=i;j>=0;j--)
		{
			if(a[i]==a[j])
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
}
