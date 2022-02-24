package PredicateExercise;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ProductsGreaterThanAmountOrFromElectronicsCategory {

	public static void main(String[] args) {
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(new Product("TV","Electronic","A",1000));
		list.add(new Product("Rice","Food","B",99));
		list.add(new Product("Fridge","Electronic","A+",1000));
		list.add(new Product("Dal","Food","A",80));
		list.add(new Product("Remote","Electronic","A+",50));
		list.add(new Product("Bulb","Electronic","A+",99));
		list.add(new Product("Utlities","Other","A+",150));
		list.add(new Product("Mixer","Electronic","A+",999));
		Predicate<Product> pr=(l1)->
			l1.getPrice()>100||l1.getCategory().equals("Electronic");
		for(Product l2:list)
		{
			if(pr.test(l2))
			{
				System.out.println(l2.toString());
			}
		}

	}

}
