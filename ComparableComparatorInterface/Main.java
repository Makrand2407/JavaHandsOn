package com.pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		List<Student> l1 = new ArrayList<>();
		l1.add(new Student(4, "Ram", 23));
		l1.add(new Student(2, "Sam", 21));
		l1.add(new Student(1, "Tam", 20));
		l1.add(new Student(5, "Jam", 22));

		System.out.println("Sorting using comparable interface by name for list");
		Collections.sort(l1);
		for (Student st : l1) {
			System.out.println(st.getName());
		}

		TreeSet<Student> ts = new TreeSet<>();
		ts.add(new Student(4, "Ram", 23));
		ts.add(new Student(2, "Sam", 21));
		ts.add(new Student(1, "Tam", 20));
		ts.add(new Student(5, "Jam", 22));
		System.out.println("Sorting using comparable interface by name for set");
		for (Student st : ts) {
			System.out.println(st.getName());
		}
		System.out.println();

		List<Employee> l2 = new ArrayList<>();
		l2.add(new Employee(111, "Ram", 20000.0));
		l2.add(new Employee(101, "Tam", 25000.0));
		l2.add(new Employee(110, "Raj", 10000.0));
		l2.add(new Employee(102, "Jam", 40000.0));

		System.out.println("Sorting using Comparator interface by NameComparator");
		Collections.sort(l2, new NameComparator());
		for (Employee e : l2) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println("Sorting using Comparator interface by SalaryComparator");
		Collections.sort(l2, new SalaryComparator());
		for (Employee e : l2) {
			System.out.println(e);
		}

		System.out.println();

		TreeSet<Employee> ts1 = new TreeSet<>(new IdComparator());
		ts1.add(new Employee(111, "Ram", 20000.0));
		ts1.add(new Employee(101, "Tam", 25000.0));
		ts1.add(new Employee(110, "Raj", 10000.0));
		ts1.add(new Employee(102, "Jam", 40000.0));
		System.out.println("Sorting using Comparator interface by IdComparator");
		for (Employee e : ts1) {
			System.out.println(e);
		}
	}

}
