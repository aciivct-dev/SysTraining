package collection.framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Join2AL {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		List<Integer> ls1 = new ArrayList<Integer>();
		List<Integer> ls2 = new ArrayList<Integer>();
		System.out.println("Enter the Length of the Array List1");
		int len1 = s.nextInt();
		for (int i = 0; i < len1; i++) {
			System.out.println("Enter the 1st ArrayList's " + i + " element");
			ls1.add(s.nextInt());
		}

		System.out.println("Enter the Length of the Array List2");
		int len2 = s.nextInt();
		for (int i = 0; i < len2; i++) {
			System.out.println("Enter the ArrayList's " + i + " element");
			ls2.add(s.nextInt());
		}
		ls1.addAll(ls2);
		System.out.println(ls1);	
	}

}
