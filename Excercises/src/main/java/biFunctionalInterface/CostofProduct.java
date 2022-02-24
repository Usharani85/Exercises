package biFunctionalInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;

public class CostofProduct {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(new Product("TV",12500));
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("TV", 10);
		BiFunction<Map<String,Integer>,ArrayList<Product>,Integer> bif=(s,i)->
		{
			Set<String> set=s.keySet();
			int quantity=0;
			int price;
			for(String s1:set)
			{
				quantity=s.get(s1);
			}
			price=i.get(0).getPrice();
			return price*quantity;
			
		};
		System.out.println("Total cost of the cart is "+bif.apply(hm, list));
	}

}

	