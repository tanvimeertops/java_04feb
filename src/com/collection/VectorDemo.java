package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
 * Vector:
 * 1.It is a dynamic array
 * 2.Automatically shrink and grow
 * 3.the sequence at which data is stored same sequence data is displayed
 * 4.duplicate allowed
 * 5.add() and remove()
 * 6.default value is []
 * 7.default size is 0
 * 8.default capacity is 10
 * 
 * Enumeration : only use with vector
 * when data in [] need to be displayed in one value each line
 * 1.data in given Enumeration
 * 2.Enumeration traverse from one value to another
 * 3.value is displayed one in each line
 * 
 */
public class VectorDemo {
public static void main(String[] args) {
	Vector v1=new Vector(3,1);
	System.out.println("Default value is: "+v1);
	System.out.println("Default size is: "+v1.size());
	System.out.println("Default capacity is: "+v1.capacity());
	
	v1.add(10);
	v1.add(23.5f);
	v1.add("Tanvi");
	v1.add("Tanvi");
	v1.add(23.5f);
	v1.add("Tanvi");
	v1.add("Tanvi");
	System.out.println("Now value is: "+v1);
	System.out.println("Now size is: "+v1.size());
	System.out.println("Now capacity is: "+v1.capacity());
	
//	Iterator i1=v1.iterator();
//	
//	while (i1.hasNext()) {
//		System.out.println(i1.next());
//		
//	}
	
	Enumeration e1=v1.elements();
	while (e1.hasMoreElements()) {
		System.out.println(e1.nextElement());
		
	}
}
}
