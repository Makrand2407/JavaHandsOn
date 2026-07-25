import java.util.Comparator;

// Comparator for sorting Employee objects by salary
public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// Salary comparison
		if(o1.salary == o2.salary)
			return 0;
		else if(o1.salary > o2.salary)
			return 1;
		else
			return -1;
	}
}
