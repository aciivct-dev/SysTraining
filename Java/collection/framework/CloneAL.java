package collection.framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CloneAL {
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
		ls2.addAll(ls1);
		System.out.println(ls2);
	}
}
