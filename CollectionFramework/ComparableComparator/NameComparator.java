import java.util.Comparator;

// Comparator for sorting Employee objects by name
public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// Compare employee names alphabetically
		return o1.name.compareTo(o2.name);
	}
}
