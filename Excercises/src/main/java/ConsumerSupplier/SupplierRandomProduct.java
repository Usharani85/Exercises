package ConsumerSupplier;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierRandomProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(new Product("TV","Electronic","A",10000));
		list.add(new Product("Rice","Food","B",990));
		list.add(new Product("Fridge","Electronic","A+",10000));
		list.add(new Product("Dal","Food","A",880));
		list.add(new Product("Remote","Electronic","A+",500));
		list.add(new Product("Utilities","Other","A+",3500));
		Supplier<String> supplr=()->
		{
			Random rd=new Random();
			int index=rd.nextInt(list.size()-1);
			return list.get(index).toString();
		};
		System.out.println(supplr.get());



	}

}
