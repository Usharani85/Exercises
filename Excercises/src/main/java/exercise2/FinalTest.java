package exercise2;

import java.util.Scanner;
public class FinalTest {
	static int a,b,c,d;
	static int count;
	static int finalconsumption(int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Fan Switch on time");
		count=sc.nextInt();
		FanConsumption fc=new FanConsumption();
		a=fc.calculateFanConsumption(count);
		System.out.println("Enter Light Switch on time");
		count=sc.nextInt();
		LightConSumption light=new LightConSumption();
		b=light.calculateLightConsumption(count);
		System.out.println("Enter TV Switch on time");
		count=sc.nextInt();
		TVConsumption tv=new TVConsumption();
		c=tv.calculateTVConsumption(count);
		d=finalconsumption(a,b,c);
		System.out.println("Total Consumption in Units "+d);
	}

}
