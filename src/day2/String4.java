package day2;

import java.util.Scanner;

//Count of High Frequent Values
public class String4 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the String");
		int high = 0;
		char ch = ' ';
		String str = s.nextLine().toLowerCase();// arav
		//select one Char
		for (int i = 0; i < str.length(); i++) {
			int count = 0, recount = 0;
			//reverse check wrt to above character
			for (int j = i; j >= 0; j--) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;//if repeated count will increase
				}
			}//to filter the charcter present more than one times
			if (count == 1) {
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						recount++;
					}
				}
			}//swaping to find 
			if (high < recount) {
				high = recount;
				ch = str.charAt(i);
			}

		}
		System.out.println("High Frequent Character is '"+ch+"' count="+high);

	}

}
