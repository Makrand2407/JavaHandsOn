package com.pkg;

import java.util.*;
import java.util.function.*;

public class Main {
	public static void main(String[] args) {
		//List with Consumer
		List<String> l1 = new ArrayList<>();
		l1.add("Ram");
		l1.add("Sam");
		l1.add("Tam");
		l1.add("Jam");
		l1.forEach(e -> System.out.println(e));
		
		//Map with BiConsumer
		Map<String, Integer> hm = new HashMap<>();
		hm.put("v", 10);
		hm.put("a", 2);
		hm.put("g", 3);
		hm.put("r", 1);
		System.out.println(hm);
		hm.forEach((k,v) -> System.out.println("Key : " +k+ " Value :"+v) );
		
		//Function
		Function<String, Integer> f = (e) ->e.length();
		System.out.println(f.apply("Hello"));//5
		
		//BiFunction
		BiFunction<Integer,Integer,String> bf = (e1,e2) -> "Sum :" +(e1+e2);
		System.out.println(bf.apply(16,7));//Sum :23
		
		//Predicate
		Predicate<String> p = (e) -> e.startsWith("He");
		System.out.println(p.test("Hello"));//true
		
		//BiPredicate
		BiPredicate<Integer,String> bp = (e1,e2)-> e1>20 && e2.endsWith("bar");
		System.out.println(bp.test(25, "Foobar"));//true
		
		//Supplier
		Supplier<String> s = () -> "Hello";
		System.out.println(s.get());//Hello
		
		//BooleanSupplier
		BooleanSupplier bs = () -> 10 > 20;
		System.out.println(bs.getAsBoolean());//false
		
		// BinaryOperator
		BinaryOperator<String> bo = (e1,e2) -> e1.concat(e2);
		System.out.println(bo.apply("Hello", "World"));//HelloWorld
	}

}
