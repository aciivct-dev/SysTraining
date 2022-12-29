package collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SwapElementsAl {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		List<Integer> ls1 = new ArrayList<>();
		System.out.println("Enter the Length of the Array List");
		int len = s.nextInt();
		for (int i = 0; i < len; i++) {
			System.out.println("Enter the " + i + " element");
			ls1.add(s.nextInt());
		}
		System.out.println("Enter the Elements to Swap");
		try {
			int ind1 = ls1.indexOf(s.nextInt()), ind2 = ls1.indexOf(s.nextInt());
			Collections.swap(ls1, ind1, ind2);
			System.out.println(ls1);
		} catch (Exception e) {
			System.out.println("\nError: Element not in ArrayList!");
		}

	}
}
