package DateTimeAPIExercises;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.function.Function;

public class CalculateAgeOfPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the DOB year");
		int year=sc.nextInt();
		System.out.println("Enter the DOB month");
		int month=sc.nextInt();
		System.out.println("Enter the DOB day");
		int day=sc.nextInt();
		
		LocalDate dt=LocalDate.of(year, month, day);
		
		Function<LocalDate,Integer> ft=(date)->
		{
			LocalDate ldate=LocalDate.now();
			
		return Period.between((LocalDate)date, ldate).getYears();
		};
		
		System.out.println("Age of the person"+ft.apply(dt));
	}

}
