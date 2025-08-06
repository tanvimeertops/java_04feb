package com.collection;

import java.util.HashSet;

/*
 * HashSet :
 * 1.It is a dynamic array
 * 2.Automatically shrink and grow
 * 3.All data has hash key and all hash key are converted into hash code 
 * 3.data is stored Hash code wise
 * 4.duplicate not allowed
 * 5.add() and remove()
 * 6.default value is []
 * 7.default size is 0
 */
public class HashSetDemo {
public static void main(String[] args) {
	HashSet h1=new HashSet();
	System.out.println("Default value is: "+h1);
	System.out.println("Default size is: "+h1.size());
	
	h1.add(12);
	h1.add(23.5f);
	h1.add("Tanvi");
	h1.add('T');
	h1.add(new Integer(1000));
	h1.add("Tanvi");
	
	System.out.println("Now value is: "+h1);
	System.out.println("Now size is: "+h1.size());
	
	h1.remove('T');
	System.out.println("Now value is: "+h1);
	System.out.println("Now size is: "+h1.size());
	
}
}
