package primitiveInterface;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class IntPredicatePrimeNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int number=sc.nextInt();
		IntPredicate inp=(i)->
		{
			int m=i/2;   
			System.out.println(m);
			  if(i==0||i==1){  
			   System.out.println(i+" is not prime number"); 
			   return false;
			  }else{  
			   for(int j=2;j<=m;j++){   
			    if(i%j==0){      
			     System.out.println(i+" is not prime number"); 
			     return false;  
			    }      
			   }
			  }
			return true;
		};
		if(inp.test(number))
		{
			System.out.println(number+"is a prime number");
		}
		sc.close();
	}

}



