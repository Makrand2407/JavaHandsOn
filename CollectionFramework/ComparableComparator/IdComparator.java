import java.util.Comparator;

// Comparator for sorting Employee objects by employee id
public class IdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// Compare employee IDs
		if(o1.empId == o2.empId)
			return 0;
		else if(o1.empId > o2.empId)
			return 1;
		else
			return -1;
	}
}
