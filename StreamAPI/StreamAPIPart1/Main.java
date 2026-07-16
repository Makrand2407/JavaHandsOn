package com.pkg;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//Filter Even Numbers from List
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> r1 = l1.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(r1);
		
		//Convert Numbers in list to their squares
		List<Integer> l2 = Arrays.asList(1,2,3,4,5);
		List<Integer> r2 = l2.stream().map(n -> n*n).collect(Collectors.toList());
		System.out.println(r2);
		
		//Square Even Numbers from list
		List<Integer> l3 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> r3 = l3.stream().filter(n -> n%2==0).map(n -> n*n).collect(Collectors.toList());
		System.out.println(r3);
		
		//First Number Greater than 10 from list
		List<Integer> l4 = Arrays.asList(3,7,12,5,20);
		Optional<Integer> r4 = l4.stream().filter(n -> n>10).findFirst();
		System.out.println(r4.get());
		
		//Count how many numbers greater than 5 in list
		List<Integer> l5 = Arrays.asList(2,6,3,8,10,1);
		Long r5 = l5.stream().filter(n ->n>5).count();
		System.out.println(r5);
		
		//Find Sum and Product of numbers in list
		List<Integer> l6 = Arrays.asList(1,2,3,4,5);
		Integer sum = l6.stream().reduce(0, (a,b) ->(a+b));
		Integer product = l6.stream().reduce(1, (a,b) ->(a*b));
		System.out.println("Sum = "+sum+" Product = "+product);
		
		//Find Sum of even numbers in list
		List<Integer> l7 = Arrays.asList(1,2,3,4,5,6);
		Integer r7 = l7.stream().filter(n -> n%2==0).reduce(0,(a,b) ->(a+b));
		System.out.println(r7);
		
		//Find maximum number in list
		List<Integer> l8 = Arrays.asList(3,7,12,5,20);
		Optional<Integer> r8 = l8.stream().reduce(Integer::max);
		System.out.println(r8.get());
		
		//Sum of Square of Even Numbers from list
		List<Integer> l9 = Arrays.asList(1,2,3,4,5,6);
		Integer r9 = l9.stream().filter(n->n%2==0).map(n->n*n).reduce(0, (a,b) ->(a+b));
		System.out.println(r9);
		
		
	}

}
