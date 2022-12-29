package day4;

import java.util.Scanner;

public class User {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Book Shop");
		System.out.println("1.View Book\n2.Add Book\n3.View Stock\n4.Purchase Book");
		switch(s.nextInt())
		{
		case 1: {
			
		}
		default :
			System.out.println("");
		}
		System.out.println("1.Java\n2.Python\n3.HTML\n4.SQL");
		Library lib=new Library();
		
		Book book=lib.option(s.nextInt());
		book.details();
	}
}
