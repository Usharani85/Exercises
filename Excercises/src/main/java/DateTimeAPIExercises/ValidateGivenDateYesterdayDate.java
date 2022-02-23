package DateTimeAPIExercises;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.Predicate;

public class ValidateGivenDateYesterdayDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the date");
int day=sc.nextInt();
System.out.println("Enter the Month");
int month=sc.nextInt();
System.out.println("Enter the year");
int year=sc.nextInt();

LocalDate date=LocalDate.of(year, month, day);

Predicate<LocalDate> pr=(d1)->{
	LocalDate currentdate=LocalDate.now();
	if(d1.isEqual(currentdate.minusDays(1))) {
		return true;
	}
	
	else {
		return false;
	}
};

if(pr.test(date)) {
	
	System.out.println("Given Date is yesterday's date");
}

else {
	
	System.out.println("Given Date is not yesterday's date");
	
}

sc.close();
	}
	
	
}
