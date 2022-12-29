package collection.framework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class IteratorLL {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		LinkedList<Integer> ll1 = new LinkedList<>();
		ll1.add(1);
		ll1.add(2);
		ll1.add(3);
		ll1.add(4);
		ll1.add(5);
		ll1.add(6);
		ll1.add(7);
		ll1.add(8);
		ll1.add(9);
		ll1.add(0);
		Iterator i=ll1.iterator();
		while(i.hasNext())
		{			
			System.out.println(i.next());
		}
	
	}

}
