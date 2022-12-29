package filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class CharWrite {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the path");
		String path=s.nextLine();
		try
		{
		Writer fw= new FileWriter(path);
		System.out.println("Enter the data to write into the stream");
		String data =s.nextLine();
		System.out.println("File written Successfully");
		for(int i=0;i<data.length();i++)
		{
			fw.write(data.charAt(i));
		}
		fw.flush();
		fw.close();
		}
		catch (IOException e) {
			System.out.println("Can't Create Stream");
		}
	}
}
