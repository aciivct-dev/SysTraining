package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class ByteRead{
	static InputStream fin;
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the File path to Read");
		String path=s.nextLine();
		try
		{
		fin=new FileInputStream(path);
		int read=fin.read();
		while(read!=-1)
		{
			System.out.print((char)read);
			read=fin.read();
			fin.close();
		}
		}
		catch(Exception e)
		{
			
		}
		
	}

}
