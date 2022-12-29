package com.sysarc.Test2;

import java.util.HashSet;
import java.util.Set;

public class Six {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(56);
		s2.add(10);
		s2.add(20);
		s2.add(30);
		s2.add(47);
		s2.add(59);

		s2.retainAll(s1);

		System.out.println("After Retaining All" + s2);

	}

}
