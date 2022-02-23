package DateTimeAPIExercises;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Supplier;

public class SupplierGetnextThursdayDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<LocalDate> sp=()->{
			LocalDate currentDate=LocalDate.now();
			return currentDate.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
		};

		System.out.println("Next Thursday date"+sp.get());
	}

}