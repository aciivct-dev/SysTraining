package collection.framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchElementAL {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		List ls1 = new ArrayList<Integer>();
		System.out.println("Enter the ArrayList Length");
		int len=s.nextInt();
		for(int i=0;i<len;i++)
		{
		System.out.println("Enter the "+i+" element");
		ls1.add(s.nextInt());
		}
		System.out.println("Enter the Key Element to Check");
		int key=s.nextInt();
		String res="Not Present";
//		for (Object obj : ls1) {
//			
//			if(obj.equals(key))
//			{
//				res=obj+" Present";
//			}			
//		}
		if(ls1.contains(key))
		{
			res="Present";
		}
		System.out.println(res);

	}

}
