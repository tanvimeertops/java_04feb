package com.collection;
/*
 * HashMap :
 * 1.It is a dynamic array
 * 2.Automatically shrink and grow
 * 3.All data has a <K,V> pair
 * 4.All pair has hash key and all hash key are converted into hash code 
 * 4.data is stored Hash code wise
 * 5.duplicate key not allowed
 * 6.put() and remove()
 * 7.default value is {}
 * 8.default size is 0
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap h1=new HashMap();
		System.out.println("Default value is: "+h1);
		System.out.println("Default size is: "+h1.size());
		
		h1.put(1,"Tanvi");
		h1.put("singh", "shubham");
		h1.put("saloni", 30);
		h1.put("singh", "bhagat");
		h1.put("1", "bhagat");
		
		System.out.println("Now value is: "+h1);
		System.out.println("Now size is: "+h1.size());
		
		h1.remove("singh");
		
		System.out.println("Now value is: "+h1);
		System.out.println("Now size is: "+h1.size());
		
		Set s1=h1.entrySet();
		
		Iterator i1=s1.iterator();
		while (i1.hasNext()) {
//			System.out.println(i1.next());
			Map.Entry me=(Map.Entry)i1.next();
			System.out.println("key is :"+me.getKey());
			System.out.println("Value is :"+me.getValue());
		}
	}

}
