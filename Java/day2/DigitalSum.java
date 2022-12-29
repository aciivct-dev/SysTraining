package day2;

import java.util.Scanner;

public class DigitalSum {
static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter the Number to Find Digital Sum");	
	long number=s.nextLong(),sum=0,last;
	while(number>0)
	{
		last=number%10;
		sum+=last;
		number/=10;
	}	
	System.out.println("Digital Sum is "+sum);
}
}
