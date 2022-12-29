package test1;

import java.util.Scanner;

//BackWard Facing Increasing Triangle
public class Prog4 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the n Value");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i >= j && i+j>=n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
