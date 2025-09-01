package com.pkg;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		//HashMap
		Map<Integer,String> hm = new HashMap<>();
		System.out.println(hm.size());//0
		hm.put(10,"apple");
		hm.put(13,"Grapes");
		hm.put(15,"banana");
		hm.put(16,"Guava");
		hm.put(10,"Mango");
		System.out.println(hm.size());//4
		System.out.println(hm);//{16=Guava, 10=Mango, 13=Grapes, 15=banana}
		
		System.out.println(hm.putIfAbsent(20, "Melon"));//null
		System.out.println(hm.putIfAbsent(11, "Berry"));//null	
		System.out.println(hm.putIfAbsent(10, "Lemon"));//Mango
		System.out.println(hm.size());//6
		System.out.println(hm);//{16=Guava, 20=Melon, 10=Mango, 11=Berry, 13=Grapes, 15=banana}
		
		System.out.println(hm.get(16));//Guava
		System.out.println(hm.get(17));//null
		System.out.println(hm.getOrDefault(17, "Pineapple"));//Pineapple

		System.out.println(hm.remove(10));//Mango
		System.out.println(hm.get(10));//null
		System.out.println(hm.remove(11, "Berry"));//true
		System.out.println(hm.get(11));//null
		System.out.println(hm.remove(13, "Berry"));//false
		System.out.println(hm.get(13));//Grapes
		System.out.println(hm);//{16=Guava, 20=Melon, 13=Grapes, 15=banana}
		System.out.println(hm.replace(20, "MuskMelon"));//Melon
		System.out.println(hm.get(20));//MuskMelon
		System.out.println(hm.replace(16, "Guava", "Orange"));//true
		System.out.println(hm);//{16=Orange, 20=MuskMelon, 13=Grapes, 15=banana}

		Set set = hm.entrySet();
		Iterator i1 = set.iterator();
		while(i1.hasNext()) {
			Map.Entry me = (Map.Entry)i1.next();
			System.out.println(me.getKey()+" "+me.getValue());/*16 Orange
                                                          20 MuskMelon
                                                          13 Grapes
                                                          15 banana*/
		}
		set = hm.keySet();
		Iterator<Integer> i2 = set.iterator();
		while(i2.hasNext()) {
			Integer key = i2.next();
			System.out.println(key+" "+hm.get(key));/*16 Orange
                                                20 MuskMelon
                                                13 Grapes
                                                15 banana*/
		}

		//LinkedHashMap
		LinkedHashMap<String,Double> lm=new LinkedHashMap<>();
		lm.put("sam",23.45);
		lm.put("tam",13.45);
		lm.put("jam",33.45);
		lm.put("ram",53.45);
		lm.put("yam",73.45);
		System.out.println(lm);//{sam=23.45, tam=13.45, jam=33.45, ram=53.45, yam=73.45}

		//TreeMap
		TreeMap<String,Double> tm=new TreeMap<>();
		tm.put("sam",23.45);
		tm.put("tam",13.45);
		tm.put("jam",33.45);
		tm.put("ram",53.45);
		tm.put("yam",73.45);
		System.out.println(tm);//{jam=33.45, ram=53.45, sam=23.45, tam=13.45, yam=73.45}

		//HashTable
		Hashtable<String,Integer> ht = new Hashtable<>();
		System.out.println(ht.size()); //0
		ht.put("one",10);
		ht.put("abcd",20);
		ht.put("mno",12);
		ht.put("xyz",23);
		System.out.println(ht);//{xyz=23, mno=12, one=10, abcd=20}
		System.out.println(ht.get("mno"));
		
		Set set1 = ht.entrySet();
		Iterator i=set1.iterator();
		while(i.hasNext()) {
			Map.Entry me=(Map.Entry)i.next();
			System.out.println(me.getKey()+" "+me.getValue());/*xyz 23
                                                          mno 12
                                                          one 10
                                                          abcd 20*/
		}

		Enumeration<String> e = ht.keys();
		while(e.hasMoreElements()) {
			 String key=e.nextElement();
			 System.out.println(key+" "+ht.get(key));
		}

		//Properties
		Properties p = new Properties();
		p.put("lion","animal");
		p.put("apple", "fruit");
		p.put("carrot", "vegetable");
		System.out.println(p);//{apple=fruit, lion=animal, carrot=vegetable}

	}
}
