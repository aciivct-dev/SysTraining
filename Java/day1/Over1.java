package day1;

public class Over1 
{
	public static void main(String[] args) {
		Over1 obj=new Over1();
		obj.printMethod();
		obj.printMethod(10);
		obj.printMethod(20,30);
	}
	public void printMethod() 
	{
		System.out.println("No Parameter Method");
	}
	
	public void printMethod(int a) 
	{
		System.out.println("One Parameter Method");
	}
	
	public void printMethod(int a,int b) 
	{
		System.out.println("Two Parameter Method");
	}
}