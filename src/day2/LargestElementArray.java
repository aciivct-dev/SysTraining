package day2;

public class LargestElementArray {
	public static void main(String[] args) {
		int ar[]={12,28,03,21,22,18,13};
		int max=0;
		for(int i=0;i<ar.length;i++)
		{
			if(max<ar[i])
			{
				max=ar[i];
			}
			
		}
		System.out.println(max);
	}

}
