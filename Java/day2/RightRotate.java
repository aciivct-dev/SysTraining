package day2;

public class RightRotate {
	public static void main(String[] args) {
	int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
	int n=2;
	System.out.println("Enter the Value");
	for(int i=0;i<n;i++)
	{
		
		int temp=ar[ar.length-1];
		for(int j=ar.length-1;j<0;j--)
		{
			ar[j]=ar[j-1];
		}
		ar[0]=temp;
	}
	
	for (int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}
}
}
