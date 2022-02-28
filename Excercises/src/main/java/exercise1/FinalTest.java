package exercise1;

import java.util.Scanner;

public class FinalTest {

	static int a,b,c,d;
	static int count;
	static int finalcostofFlowers(int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		Flowers fl=new Roses();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Rose flower count");
		count=sc.nextInt();
		fl.setCountofFlowers(count);
		a=fl.getCostofFlowers();
		fl=new Jasmine();
		System.out.println("Enter the Jasmine flower count");
		count=sc.nextInt();
		fl.setCountofFlowers(count);
		b=fl.getCostofFlowers();
		fl=new Lilly();
		System.out.println("Enter the Lilly flower count");
		count=sc.nextInt();
		fl.setCountofFlowers(count);
		c=fl.getCostofFlowers();
		d=finalcostofFlowers(a,b,c);
		System.out.println("Final Cost of Flowers "+d);
	}

}
