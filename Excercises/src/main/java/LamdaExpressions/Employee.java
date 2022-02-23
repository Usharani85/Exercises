package LamdaExpressions;

public class Employee {
	
	int empId;
	String empName;
	String course;
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	
		
	Employee(int empId,String empName,String course){
		this.empId=empId;
		this.empName=empName;
		this.course=course;
	}
	
	public String toString() {
		return empId+""+empName+""+course+"";
		
	}

}
