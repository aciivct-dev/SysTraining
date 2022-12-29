package collection.framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwapElementAL {
static Scanner s=new Scanner (System.in);
public static void main(String[] args) {
	List<Integer> ls1=new ArrayList<>();
	System.out.println("Enter the Length of the Array List");
	int len=s.nextInt();
	for(int i=0;i<len;i++)
	{
	System.out.println("Enter the "+i+" element");
	ls1.add(s.nextInt());
	}
	System.out.println("Enter the Element to Existing Element to Swap");
	int exist =s.nextInt();
	System.out.println("Enter the New Element to Swap");
	int swap =s.nextInt();
	ls1.set(ls1.indexOf(exist), swap);
	System.out.println(ls1);
}
}
