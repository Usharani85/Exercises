package constructorReference;

class Employee {
	
	public String name,account;
	public double salary;
	
	public Employee(String name,String account,double salary) {
		this.name=name;
		this.account=account;
		this.salary=salary;
	}
	
	public String toString(String name,String account,double salary) {
		return "EmpName : "+name+"EmpAccount : "+account+"EmpSalary : "+salary;
	}
}
	
	public class ConstructorReferenceEmployee{
		public static void main(String[] args) {
			
		GetEmployee emp=Employee::new;
		System.out.println(emp.getEmpdetails("peter", "account", 10000));
	}

}
