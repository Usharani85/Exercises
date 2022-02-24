package biFunctionalInterface;

import java.util.function.BiFunction;

public class CreateProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<String,Integer,Product> bi=(t,u)->{
			return new Product(t,u);
		};
System.out.println(bi.apply("TV", 1000));
	}

}
