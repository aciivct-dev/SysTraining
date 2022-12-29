package com.sysarc.Test2;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Second {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		System.out.println("Enter the limit");
		int limit = s.nextInt();
		for (int i = 1; i <= limit; i++) {
			System.out.println("Enter the " + i + " Element");
			pq.add(s.nextInt());
		}
		System.out.println("Queue Before Polling \n" + pq);
		System.out.println("\nQeue Retriving First Element---->" + pq.poll());
		System.out.println("\nQueu After Removing First Element\n" + pq);
	}
}
