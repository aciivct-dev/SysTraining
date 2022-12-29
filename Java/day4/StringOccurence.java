package day4;

import java.util.Scanner;

public class StringOccurence {
	static Scanner s=new Scanner (System.in);
	 public static void main(String[] args) {
		 System.out.println("Enter the String ");
		 String str=s.nextLine().toLowerCase();//Zeeba
		 char ch []=str.toCharArray();
		 for(int i=0;i<ch.length;i++)
		 {
			 int precount=0,count=0;
			 //precheck
			 for(int j=i;j>=0;j--)
			 {
				 if(ch[i]==ch[j])
				 {	
					 precount++;
				 }
			 }
			 if(precount==1)//zeba
			 {
				 for(int j=i;j<ch.length;j++)
				 {
					 if(ch[i]==ch[j])
					 {
						 count++;
					 }
					 
				 }
				 System.out.println(ch[i]+" Count="+count);
			 }
			 
		 }
		
	}
	 

}
