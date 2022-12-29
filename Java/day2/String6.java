package day2;

import java.util.Scanner;

//remove all duplicate values
public class String6 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the String");
		String str = s.nextLine();
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			//Precheck
			for (int j =i; j >=0 ; j--) {
				if (str.charAt(i) == str.charAt(j))
					count++;
			}
			if (count == 1)
				res += str.charAt(i);
		}
		System.out.println(res);
	}

}
