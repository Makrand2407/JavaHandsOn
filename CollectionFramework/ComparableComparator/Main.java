import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		// Comparable Example
		// List of Student objects
		List<Student> l2 = new ArrayList<>();
		l2.add(new Student(4,"Ram",23));
		l2.add(new Student(2,"Sam",21));
		l2.add(new Student(1,"Tam",20));
		l2.add(new Student(5,"Jam",22));

		// Collections.sort() uses compareTo(), Natural sorting based on Student name
		Collections.sort(l2);
		System.out.println("Students sorted by name:");
		for(Student st : l2)
			System.out.println(st.getName());

		// TreeSet uses compareTo() automatically, Maintains sorted order while inserting
		TreeSet<Student> ts = new TreeSet<>();
		ts.add(new Student(4,"Ram",23));
		ts.add(new Student(2,"Sam",21));
		ts.add(new Student(1,"Tam",20));
		ts.add(new Student(5,"Jam",22));
		System.out.println("\nTreeSet Student sorting:");
		for(Student st : ts)
			System.out.println(st.getName());

		// Comparator Example
		List<Employee> l3 = new ArrayList<>();
		l3.add(new Employee(111,"Ram",20000.0));
		l3.add(new Employee(101,"Tam",25000.0));
		l3.add(new Employee(110,"Raj",10000.0));
		l3.add(new Employee(102,"Jam",40000.0));

		// Sorting List using NameComparator
		Collections.sort(l3,new NameComparator());
		System.out.println("\nEmployees sorted by name:");
		for(Employee e:l3)
			System.out.println(e);

		// Sorting List using SalaryComparator
		Collections.sort(l3,new SalaryComparator());
		System.out.println("\nEmployees sorted by salary:");
		for(Employee e:l3)
			System.out.println(e);

		// TreeSet with Comparator, Sorting Employee objects based on employee id
		TreeSet<Employee> ts1 = new TreeSet<>(new IdComparator());
		ts1.add(new Employee(111,"Ram",20000.0));
		ts1.add(new Employee(101,"Tam",25000.0));
		ts1.add(new Employee(110,"Raj",10000.0));
		ts1.add(new Employee(102,"Jam",40000.0));

		System.out.println("\nTreeSet Employee sorting by id:");
		for(Employee e : ts1)
			System.out.println(e);

	}
}
