package ConsumerSupplier;

import java.util.ArrayList;
import java.util.function.Consumer;

public class UpgradeProductGrade {

	public static void main(String[] args) {
		
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(new Product("TV","Electronic","A",10000));
		list.add(new Product("Rice","Food","B",990));
		list.add(new Product("Fridge","Electronic","A+",10000));
		list.add(new Product("Dal","Food","A",880));
		list.add(new Product("Remote","Electronic","A+",500));
		list.add(new Product("Utilities","Other","A+",3500));

Consumer<ArrayList<Product>> csr=(p)->{
	for (Product product : p) {
		
		if(product.getPrice()>1000) {
		product.setGrade("Premium");
	}
		
		System.out.println(product.toString());
	}
};

csr.accept(list);
	}

}
