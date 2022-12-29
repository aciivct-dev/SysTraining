package day1;

public class Super3 extends Super2{
	float allowance = 2300;

	public static void main(String[] args) {
		Super3 obj=new Super3();
		obj.totalSal=obj. allowance+obj.baseSal+obj.bonus+obj.pf;
		System.out.println("Total Salary "+obj.totalSal);
	}
}
