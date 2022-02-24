package FunctionInterfaceExercise;

import java.util.ArrayList;
import java.util.function.Function;

public class CostofProductsGreaterthanAmount {
	public static void main(String[] args) {
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(new Product("TV","Electronic","A",10000));
		list.add(new Product("Rice","Food","B",990));
		list.add(new Product("Fridge","Electronic","A+",10000));
		list.add(new Product("Dal","Food","A",880));
		list.add(new Product("Remote","Electronic","A+",500));
		list.add(new Product("Utlities","Other","A+",1500));
		Function<ArrayList<Product>,Integer> fn=(p1)->
		{
			int costofproducts=0;
			for(Product p:p1)
			{
				if(p.getPrice()>1000)
				costofproducts+=p.getPrice();
			}
			return costofproducts;
		};
		System.out.println("Cost of all products is "+fn.apply(list));
	}

}
