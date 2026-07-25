// Employee class used for Comparator examples
public class Employee {
	Integer empId;
	String name;
	Double salary;


	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}


	// Constructor to initialize Employee object
	public Employee(Integer empId, String name, Double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}


	public Employee() {
		super();
	}


	// Prints employee object details
	@Override
	public String toString() {
		return "Employee [empId=" + empId +
				", name=" + name +
				", salary=" + salary + "]";
	}
}
