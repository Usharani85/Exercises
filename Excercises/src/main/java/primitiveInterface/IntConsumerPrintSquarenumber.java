package primitiveInterface;

import java.util.Scanner;
import java.util.function.IntConsumer;

public class IntConsumerPrintSquarenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int number=sc.nextInt();
		
		IntConsumer inc=(i)->System.out.println("Square number"+(i*i));
		
		inc.accept(number);
		sc.close();

	}

}
