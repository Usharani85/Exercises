package ConsumerSupplier;

public class Product {
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
	public String getGrade()
	{
		return grade;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setCategory(String category)
	{
		this.category=category;
	}
	public void setGrade(String grade)
	{
		this.grade=grade;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	@Override
	public String toString()
	{
		return "Product name "+name+" Product price "+price+" Product category "+category+" Product grade "+grade;
	}


}
