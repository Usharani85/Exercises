package ConsumerSupplier;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Consumer;

public class PrintProductAppropriateMedium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(new Product("TV","Electronic","A",10000));
		list.add(new Product("Rice","Food","B",990));
		list.add(new Product("Fridge","Electronic","A+",10000));
		list.add(new Product("Dal","Food","A",880));
		list.add(new Product("Remote","Electronic","A+",500));
		list.add(new Product("Utilities","Other","A+",3500));
		Consumer<String> csr=(str)->
		{
			String ir=list.get(0).toString();
			if(str.contentEquals("file"))
			{
				
				try {
					FileWriter writer = new FileWriter(System.getProperty("user.dir")+"\\TestData\\Product.txt");
					writer.write(ir);
					System.out.println("Successfully written the content");
					writer.close();
				}
				catch(IOException i)
				{
					i.printStackTrace();
				}
			}
			else
			{
				System.out.println(ir);
			}
			
		};
		csr.accept("file");
	}



}
