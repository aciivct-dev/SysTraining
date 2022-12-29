package com.sysarc.Test2;

import java.util.HashSet;

public class Three {
	public static void main(String[] args) {
		HashSet<Integer> hs1 = new HashSet<>();

		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add(40);
		hs1.add(50);
		System.out.println("Before Clone" + hs1);
		HashSet<Integer> hs2 = (HashSet) hs1.clone();
		System.out.println("\nAfter Clone" + hs2);
	}
}
