package day4;

import java.util.Scanner;

public class Book {
	Scanner s=new Scanner (System.in);
	String book;
	String author;
	int price;
	static int stock = 20;
	public Book()
	{}

	public Book(String book, String author, int price) {
		this.book = book;
		this.author = author;
		this.price = price;
	}
	public void details()
	{
		System.out.println("Book Name:"+book+"\nAuthor Name:"+author+"\nPrice:"+price);
		System.out.println("Press '1' to Purchase");
		if(s.nextInt()==1)
		{
			System.out.println("Enter the Quantity");
			int qty=s.nextInt();
			if(qty<=stock)
			{
			stock-=qty;
			System.out.println("Book Name:"+book+"\nQuantity:"+qty+"\nTotal Price:"+price*qty+"\nStock:"+stock);
			System.out.println("\nEnter '1' to Proceed to Payment");
				if(s.nextInt()==1)
					payment();
				else
					System.out.println("Terminating Purchase\nThankYou");
			}
			else
				System.out.println("InSufficient Stock");
		}
		else
			System.out.println("Terminating Purchase\nThankYou");
	}
		
		 void payment()
		{
			System.out.println("Choose Payment Method\n1.Cash\n2.UPI");	
			if(s.nextInt()==1)
				System.out.println("Cash Paid Successfully\nThankYou");
			else if(s.nextInt()==2)
			{
				System.out.println("Transacton Successful\nThankYou");
			}
			else
				System.out.println("Invalid Paysment Method\nThankYou");
		}
	}
