package streamsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GetProductFromElectronicCategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> productList=new ArrayList<Product>();
		productList.add(new Product("ac",40000,"electronics","B"));
		productList.add(new Product("Rice",999,"food","A"));
		productList.add(new Product("pulses",800,"food","A"));
		productList.add(new Product("TV",20000,"electronics","B"));
		
		List<String> ElectronicCategoryList=productList.stream().filter(k->k.getCategory().equals("electronics")).map(Product::toString).collect(Collectors.toList());
			System.out.println(ElectronicCategoryList);	

	}

}
