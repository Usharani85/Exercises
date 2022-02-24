package PredicateExercise;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ProductsFromElectronicCategory {

	public static void main(String[] args) {
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(new Product("TV","Electronic","A",10000));
		list.add(new Product("Rice","Food","B",990));
		list.add(new Product("Fridge","Electronic","A+",10000));
		list.add(new Product("Dal","Food","A",880));
		list.add(new Product("Remote","Electronic","A+",500));
		list.add(new Product("Utlities","Other","A+",1500));
		Predicate<Product> pr=(l1)->l1.getCategory().equals("Electronic");
		for(Product l2:list)
		{
			if(pr.test(l2))
			{
				System.out.println(l2.toString());
			}
		}
	}

}
