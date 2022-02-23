package LamdaExpressions;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSortEmployeeDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,Employee> emp=new TreeMap<Integer,Employee>();
		emp.put(5, new Employee(12, "vanitha", "science"));
		emp.put(3, new Employee(10, "anitha", "maths"));
		emp.put(10, new Employee(7, "sabitha", "computerscience"));
		emp.put(1, new Employee(21, "lalitha", "social"));
		
		emp.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getEmpName).reversed())).forEach(System.out::println);

	}

}
