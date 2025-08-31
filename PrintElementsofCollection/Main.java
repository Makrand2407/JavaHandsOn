package com.pkg;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(30);
		l1.add(20);
		l1.add(10);
		l1.add(24);
		System.out.println(l1);
		
		System.out.println("1.Using for loop:");
		for(int i =0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		
		System.out.println("2.Using foreach statement: ");
		for(Integer i:l1) {
			System.out.println(i);
		}
		
		System.out.println("3.Using Iterator: ");
		Iterator<Integer> i = l1.iterator();
		while(i.hasNext()) {
			Integer i1 = i.next();
			System.out.println(i1);
		}
		
		System.out.println("4.Using ListIterator: ");
		List<Student> l2 = new ArrayList<>();
		l2.add(new Student (1,"Ram",23));
		l2.add(new Student (2,"Sam",21));
		l2.add(new Student (3,"Tam",20));
		l2.add(new Student (4,"Jam",22));

		ListIterator<Student> li = l2.listIterator();
		while(li.hasNext()) {
			Student s1 = li.next();
			System.out.println(s1.getName()+" "+s1.getAge());
		}
		System.out.println();
		while(li.hasPrevious()) {
			Student s1 = li.previous();
			System.out.println(s1.getName()+" "+s1.getAge());
		}
		System.out.println();
		
		List<String> l3 = new ArrayList<>();
		l3.add("Ram");
		l3.add("Sam");
		l3.add("Tam");
		l3.add("Jam");
		ListIterator<String> li1 = l3.listIterator();
		while(li1.hasNext()) {
			String s1 = li1.next();
			System.out.println(s1 + "mmmm");
		}
		System.out.println();
		while(li1.hasPrevious()) {
			String s1 = li1.previous();
			System.out.println(s1 + "mmmm");
		}
		
		System.out.println("5.Using Enumeration:");
		Vector <Integer> v = new Vector<>();
		v.add(1);
		v.add(2);
		v.add(3);
		System.out.println(v);
		Enumeration <Integer> e = v.elements();
		while(e.hasMoreElements()) {
			Integer i2 = e.nextElement();
			System.out.println(i2);
		}


	}
}
