package day2;

import java.util.Scanner;

//count vowels and consonents
public class String2 {
	static Scanner s=new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Enter any String");
		String str=s.nextLine().toLowerCase();
		int vcount=0,ccount=0;
		for (int i=0;i<str.length();i++)
		{
			if(vowel(str.charAt(i)))
			{
				vcount++;
			}
			else if (consonents(str.charAt(i)))
			{
				ccount++;	
			}
			else
				System.out.println("Neither Vowels Nor Consonents");
		}
		System.out.println("Vowels Count is "+vcount);
		System.out.println("Consonents Count is "+ccount);
	}
	public static boolean vowel(char ch)
	{
		boolean res=false;
		if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o' || ch=='u')
		{
			res=true;
		}
			return res;
	}
	public static boolean consonents(char ch)
	{
		boolean res=false;
		if(ch>='a' && ch<='z')
		{
			res=true;
		}
			return res;
	}
}

