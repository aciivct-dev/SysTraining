package day2;

import java.util.Scanner;

//wajp to find count of Alphabet,SpecialCharacters,Numbers.
public class String1 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter any String");
		String str=s.nextLine();
		int ucount=0,lcount=0,ncount=0,scount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
				ucount++;
			else if (str.charAt(i)>=97 && str.charAt(i)<=122)
				lcount++;
			else if (str.charAt(i)>=48 && str.charAt(i)<=57)
				ncount++;
			else 
				scount++;
		}
		if(ucount>0)
		System.out.println("Count of Upercase is "+ucount);
		if(lcount>0)
		System.out.println("Count of Lowercase is "+lcount);
		if(ncount>0)
		System.out.println("Count of Number is "+ncount);
		if(scount>0)
		System.out.println("Count of SpecialCharacters is "+scount);
	}
}
