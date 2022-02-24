package ConsumerSupplier;

import java.util.ArrayList;
import java.util.function.Consumer;

public class GetProductSuffixAstricPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(new Product("TV","Electronic","A",10000));
		list.add(new Product("Rice","Food","B",990));
		list.add(new Product("Fridge","Electronic","A+",10000));
		list.add(new Product("Dal","Food","A",880));
		list.add(new Product("Remote","Electronic","A+",500));
		list.add(new Product("Utilities","Other","A+",3500));
		Consumer<ArrayList<Product>> csmer=(p)->
		{
			for(Product l1:p)
			{
			if(l1.getPrice()>1000)
			{	
				l1.setGrade("Premium");
				if(l1.getPrice()>3000)
				{
				l1.setName(l1.getName()+"*");
				}
			}
			if(l1.getName().contains("*"))
			{
				System.out.println(l1.toString());
			}
			}
		};
		csmer.accept(list);
	}


	}


