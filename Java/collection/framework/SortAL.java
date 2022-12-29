package collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortAL {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		List<Integer> ls1=new ArrayList<>();
		System.out.println("Enter the Length of the Array List");
		int len=s.nextInt();
		for(int i=0;i<len;i++)
		{
		System.out.println("Enter the "+i+" element");
		ls1.add(s.nextInt());		
		}
		System.out.println("Before Sorting\n"+ls1);
//		Collections.sort(ls1,(I1,I2)->(I1>I2?1:(I1<I2)?-1:0));
		Collections.sort(ls1);
		System.out.println("After Sorting\n"+ls1);
	}
}

