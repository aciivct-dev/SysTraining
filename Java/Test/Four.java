package com.sysarc.Test2;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Four {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		NavigableSet<Integer> ts1 = ts.descendingSet();
		System.out.println("Before Descending " + ts);
		System.out.println("After Descending " + ts1);
	}
}
