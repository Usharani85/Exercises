package LamdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class namecomparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub

		if (o1.empName.compareTo(o2.empName) > 0) {
			return +1;
		}

		else if (o1.empName.compareTo(o2.empName) < 0) {
			return -1;
		} else {
			return 0;
		}

	}
}

public class SortingEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(12, "vanitha", "science"));
		employee.add(new Employee(10, "anitha", "maths"));
		employee.add(new Employee(7, "sabitha", "computerscience"));
		employee.add(new Employee(21, "lalitha", "social"));

		// without using Lamda Expression
		Collections.sort(employee, new namecomparator());

		System.out.println(employee);
		// method1 using Lamda expression
		employee.stream().sorted(Comparator.comparing(Employee::getEmpName)).forEach(System.out::println);

		// method2 using Lamda expression
		Collections.sort(employee, (o1, o2) -> {
			if (o1.empName.compareTo(o2.empName) > 0) {
				return +1;
			}

			else if (o1.empName.compareTo(o2.empName) < 0) {
				return -1;
			} else {
				return 0;
			}

		});

		System.out.println("Sorting using method 2" + employee);
	}

}
