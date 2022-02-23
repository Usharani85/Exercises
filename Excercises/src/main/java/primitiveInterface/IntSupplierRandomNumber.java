package primitiveInterface;

import java.util.Random;
import java.util.function.IntSupplier;

public class IntSupplierRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IntSupplier ins=()->
{
	Random random=new Random();
	return random.nextInt(5000);
};

System.out.println("Random Number generated before 5000 is : "+ins.getAsInt());
	}

}
