package streamsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CalculateCountofElectronics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> productList=new ArrayList<Product>();
		productList.add(new Product("ac",40000,"electronics","B"));
		productList.add(new Product("Rice",999,"food","A"));
		productList.add(new Product("pulses",800,"food","A"));
		productList.add(new Product("TV",20000,"electronics","B"));
		
		long ElectronicCategorycount=productList.stream().filter(k->k.getCategory().equals("electronics")).count();
			System.out.println(ElectronicCategorycount);	
	}

}
