package biFunctionalInterface;

public class Product {
	
	private String name;
	private int price;
	
	Product(String name,int price){
		this.name=name;
		this.price=price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return "Product Name : "+name+"Product Price : "+price;
		
		
		
	}
	

}
