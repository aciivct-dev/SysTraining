package filehandling;

import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

public class CharRead {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the Path");
		String path = s.nextLine();
		try
		{
		Reader fr = new FileReader(path);
		int data=0;
	while ((data=fr.read())!=-1)
	{
		System.out.print((char)data);
	}
		
		fr.close();
		} 
		catch (Exception e) {
			
		}

	}

}
