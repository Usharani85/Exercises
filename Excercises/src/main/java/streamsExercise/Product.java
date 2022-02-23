package streamsExercise;

public class Product {
	
	private String name, category, grade;
	private int price;
	
	Product(String name,int price,String category,String grade){
		this.name=name;
		this.price=price;
		this.category=category;
		this.grade=grade;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String toString() {
		return "Product Name : "+name+" Product Price : "+price+" Product Category : "+category+" Product grade : "+grade;
		
	}

}
