package collection.framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List1 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		List l1  = new ArrayList();
		l1.add("Hai");
		l1.add(10);
		System.out.println(l1);
		for (Object obj : l1) {
			System.out.println(obj);
		}
	}
}
