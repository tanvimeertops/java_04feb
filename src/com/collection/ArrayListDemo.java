package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Collection : collection of data of different type
 * 
 * class: 
 * ArrayList :
 * 1.It is a dynamic array
 * 2.Automatically shrink and grow
 * 3.the sequence at which data is stored same sequence data is displayed
 * 4.duplicate allowed
 * 5.add() and remove()
 * 6.default value is []
 * 7.default size is 0
 * 
 * Hashset
 * Hashmap
 * Vector
 * Generic
 * 
 * Interface: 
 * List
 * Set
 * Map
 * Iterator :
 * when data in [] need to be displayed in one value each line
 * 1.data in given Iterator
 * 2.iterator traverse from one value to another
 * 3.value is displayed one in each line
 * Enumeration
 */
public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	
	System.out.println("Default value is: "+a1);
	System.out.println("Default size is: "+a1.size());
	
	a1.add(12);
	a1.add(23.5f);
	a1.add("Tanvi");
	a1.add('T');
	a1.add(new Integer(1000));
	a1.add("Tanvi");
	System.out.println("Now value is: "+a1);
	System.out.println("Now size is: "+a1.size());
	
	a1.remove(4);
	System.out.println("Now value is: "+a1);
	System.out.println("Now size is: "+a1.size());
	
	a1.remove("Tanvi");
	System.out.println("Now value is: "+a1);
	System.out.println("Now size is: "+a1.size());
	
	Iterator i1=a1.iterator();
	
	while (i1.hasNext()) {
		System.out.println(i1.next());
		
	}
}
}
