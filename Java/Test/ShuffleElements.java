package com.sysarc.Test2;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleElements {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("Before Shuffling \n" + al);
		Collections.shuffle(al);
		System.out.println("After Shuffling \n" + al);
	}

}
