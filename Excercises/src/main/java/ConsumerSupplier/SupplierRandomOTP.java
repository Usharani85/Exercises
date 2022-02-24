package ConsumerSupplier;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class SupplierRandomOTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Integer> spr=()->
		{
			Random random=new Random();
			int j = random.nextInt(20000, 789000);
			int i = ThreadLocalRandom.current().nextInt(100000, 1000000);
			return j;
		};
		System.out.println(spr.get());


	}

}
