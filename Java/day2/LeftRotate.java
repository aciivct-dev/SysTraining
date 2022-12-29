package day2;

public class LeftRotate {
	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n=2;
		for (int i = 0; i < n; i++) {
			int temp = ar[0];
			for (int j = 0; j < ar.length-1; j++) {
				ar[j]=ar[j+1];
			}
			ar[ar.length-1]=temp;
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]);
		}
	}
}
