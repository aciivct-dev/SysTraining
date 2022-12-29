package test1;

import java.util.Scanner;

public class Prog5 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		TV obj1 = new TV();
		System.out.println("Press '1' to Increace TV Volume\n Press '2' to Decrease TV Volume");
		if (s.nextInt() == 1)
			obj1.incVol();
		else if (s.nextInt() == 1)
			obj1.decVol();
		else
			System.out.println("Invalid Selection");

	}
}

abstract class Remote {
	abstract public void incVol();

	abstract public void decVol();
}

class TV extends Remote {
	public void incVol() {
		System.out.println("Increase TV Volume");
	}

	public void decVol() {
		System.out.println("Decrease TV Volume");
	}
}
