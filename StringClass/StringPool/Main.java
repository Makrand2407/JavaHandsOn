package com.pkg;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1==s2);// true (refers to same pool object)
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		System.out.println(s3==s4); //false (different heap objects)
		System.out.println(s3.equals(s4)); //true (same content)
		
		String s5 = new String("Java");
		String s6 = s5.intern();
		String s7 = "Java";
		System.out.println(s5==s6); //false (s5 is heap, s6 is pool)
		System.out.println(s6==s7); //true (both point to pool)	 

	}

}

