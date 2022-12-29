package filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class ByteWrite {
	static OutputStream fo;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args)  {
		System.out.println("Enter the Path");
		String path = s.nextLine();
		try
		{
		fo = new FileOutputStream(path);
		}
		catch (Exception e)
		{
			System.out.println("Can't Create File");
		}
		System.out.println("Enter the Data to Write");
		String data=s.nextLine();
		byte[]b=data.getBytes();
		try
		{
		fo.write(b);
		fo.flush();
		fo.close();
		}
		catch(IOException e)
		{
			System.out.println("Cant Write into File");
		}
	}
}
