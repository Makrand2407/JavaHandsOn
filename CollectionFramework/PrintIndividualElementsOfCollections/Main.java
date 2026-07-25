import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {

		// Creating an ArrayList using List interface reference
		List<Integer> l1 = new ArrayList<>();

		// Adding elements into ArrayList
		l1.add(30);
		l1.add(20);
		l1.add(10);
		l1.add(24);
		System.out.println(l1); // [30, 20, 10, 24]


		// 1. Traversing collection using normal for loop
		// Works using index position, mainly used with List
		System.out.println("1.Using for loop:");
		for(int i = 0; i < l1.size(); i++) {
			// get(index) returns element from particular index
			System.out.println(l1.get(i));
		}

		// 2. Traversing collection using enhanced for loop
		// Internally uses Iterator
		System.out.println("2.Using foreach statement:");
		for(Integer i : l1) {
			// Directly accesses each element
			System.out.println(i);
		}

		// 3. Traversing collection using Iterator
		// Iterator works with all Collection classes
		System.out.println("3.Using Iterator:");
		Iterator<Integer> i = l1.iterator();
		// hasNext() checks whether next element is available
		while(i.hasNext()) {
			// next() returns next element
			Integer i1 = i.next();
			System.out.println(i1);
		}

		// 4. Traversing collection using ListIterator
		// ListIterator supports forward and backward traversal
		List<Student> l2 = new ArrayList<>();
		// Adding Student objects into ArrayList
		l2.add(new Student(1,"Ram",23));
		l2.add(new Student(2,"Sam",21));
		l2.add(new Student(3,"Tam",20));
		l2.add(new Student(4,"Jam",22));

		// Creating ListIterator object
		ListIterator<Student> li = l2.listIterator();
		// Forward direction traversal
		while(li.hasNext()) {
			Student s1 = li.next();
			System.out.println(s1.getName()+" "+s1.getAge());
		}

		System.out.println();

		// Backward direction traversal
		// previous() returns previous element
		while(li.hasPrevious()) {
			Student s1 = li.previous();
			System.out.println(s1.getName()+" "+s1.getAge());
		}
		System.out.println();

		// ListIterator with String collection
		List<String> l3 = new ArrayList<>();
		l3.add("Ram");
		l3.add("Sam");
		l3.add("Tam");
		l3.add("Jam");

		ListIterator<String> li1 = l3.listIterator();
		// Forward traversal
		while(li1.hasNext()) {
			String s1 = li1.next();
			System.out.println(s1+" mmmm");
		}

		// Backward traversal
		while(li1.hasPrevious()) {
			String s1 = li1.previous();
			System.out.println(s1+" mmmm");
		}

		// 5. Traversing collection using Enumeration
		// Enumeration is a legacy interface
		// Mainly used with Vector and Hashtable
		System.out.println("5.Using Enumeration:");
		Vector<Integer> v = new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		System.out.println(v);

		// Creating Enumeration object
		Enumeration<Integer> e = v.elements();
		// Traversing Vector elements
		while(e.hasMoreElements()) {
			// nextElement() returns next element
			Integer i2 = e.nextElement();
			System.out.println(i2);
		}
	}
}
