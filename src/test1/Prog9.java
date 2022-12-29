package test1;

import java.util.Scanner;

public class Prog9 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Length of the Array");
		int[] arr1 = new int[s.nextInt()];
		String str = "";

		// --------------------getting inputs for array
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter the " + i + " Array Element ");
			arr1[i] = s.nextInt();
		}

		// --------------------removing duplicate from the existing Array
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					arr1[j] = -1;
				}
			}
			if (arr1[i] >= 0) {
				str += arr1[i];
			}
		}
		char[] arr2 = str.toCharArray();
		System.out.println("Length of Old Array Before removing Duplicate Elements = " + arr1.length);
		System.out.println("Length of New Array after removing Duplicate Elements = " + arr2.length);
	}
}
