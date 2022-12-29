package com.sysarc.Test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Eight {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		System.out.println("Enter the Key");
		int key = s.nextInt();
		if (key > 0 && key <= 7) {
			for (int i = key; i >= 1; i--) {
				System.out.print("{" + i + " " + map.get(i) + "}");
			}
		} else
			System.out.println("Null");
	}

}
