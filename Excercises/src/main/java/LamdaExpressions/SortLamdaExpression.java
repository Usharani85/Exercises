package LamdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortLamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		List<String> list1=new ArrayList<String>();
		list1.add("kritika");
		list1.add("Selvi");
		list1.add("puppy");
		list1.add("Appu");
		list1.add("Lali");
		list1.add("vinoth");
		list1.add("adhi");
		list1.stream().forEach(t->System.out.println(t.substring(0, 1).toLowerCase()));
		list1.stream().sorted().forEach(System.out::println);
		//list1.stream().filter(t->t.substring(0, 1).toLowerCase()).forEach(System.out::println);
		//list1.stream().forEach(t->t.substring(0, 1).toLowerCase());
		//list1.stream().forEach(t->System.out.println(t));
		//Collections.sort(list1);
		//list1.stream().forEach(t->System.out.println(t));
		//list1.stream().filter(t->t.substring(0, 1).toLowerCase())).forEach(t->System.out.println(t));
		
		Map<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1,"kritika");
		map1.put(2,"Selvi");
		map1.put(3,"puppy");
		map1.put(4,"Appu");
		map1.put(5,"Lali");
		map1.put(6,"vinoth");
		map1.put(7,"adhi");
		map1.forEach((key,value)->System.out.println(key+":"+value));
	}

}
