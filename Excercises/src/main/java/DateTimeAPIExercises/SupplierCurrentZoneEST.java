package DateTimeAPIExercises;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierCurrentZoneEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateTimeFormatter dformat = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mma 'ET'");

		Supplier<LocalDateTime> sp = () -> {
			ZoneId zone = ZoneId.of("America/New_York");
			LocalDateTime dt = LocalDateTime.now(zone);
			return dt;
		};
		System.out.println(dformat.format(sp.get()));
	}

}
