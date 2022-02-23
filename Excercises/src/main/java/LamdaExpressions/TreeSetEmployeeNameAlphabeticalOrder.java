package LamdaExpressions;

import java.util.Comparator;
import java.util.TreeSet;

class myEmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		if(o1.getEmpName().compareTo(o2.getEmpName())>0) {
			return +1;
		}
		
		else if(o1.getEmpName().compareTo(o2.getEmpName())<0) {
			return -1;
		}
		
		else {
			return 0;
		}
		
	}
	
}

public class TreeSetEmployeeNameAlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Employee> empmethod1=new TreeSet<Employee>(new myEmployeeComparator());
		empmethod1.add(new Employee(12, "vanitha", "science"));
		empmethod1.add(new Employee(10, "anitha", "maths"));
		empmethod1.add(new Employee(7, "sabitha", "computerscience"));
		empmethod1.add(new Employee(21, "lalitha", "social"));
		
		System.out.println("The Sorting without using Lamda expression"+empmethod1);
		
		//method 1 using lamda expression
		empmethod1.stream().sorted(new myEmployeeComparator()).forEach(System.out::println);
		
		//method 2 using lamda expression
		TreeSet<Employee> empmethod2=new TreeSet<Employee>((l1,l2)->{
			if(l1.getEmpName().compareTo(l2.getEmpName())>0) {
				return +1;
			}
			
			else if(l1.getEmpName().compareTo(l2.getEmpName())<0) {
				return -1;
			}
			
			else {
				return 0;
			}
			
		});
		empmethod1.add(new Employee(12, "vanitha", "science"));
		empmethod1.add(new Employee(10, "anitha", "maths"));
		empmethod1.add(new Employee(7, "sabitha", "computerscience"));
		empmethod1.add(new Employee(21, "lalitha", "social"));
		
		System.out.println("method 2 using lamda expression"+empmethod1);
}

}
