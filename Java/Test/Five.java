package com.sysarc.Test2;

import java.util.HashMap;
import java.util.Map;

public class Five {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		System.out.println("Before removing Entries " + map);
		map.clear();
		System.out.println("After Removing Enteries " + map);
	}
}
