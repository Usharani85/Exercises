package FunctionInterfaceExercise;

class Product{
	private String name,category,grade;
	private int price;
	Product(String name,String category,String grade,int price)
	{
		this.name=name;
		this.category=category;
		this.grade=grade;
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	public String getCategory()
	{
		return category;
	}
}