package PredicateExercise;

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
	public String getName()
	{
		return name;
	}
	@Override
	public String toString() {
		return "Product name "+name+" Product price "+price+" Product category "+category+" Product grade "+grade;
		
	}

}
