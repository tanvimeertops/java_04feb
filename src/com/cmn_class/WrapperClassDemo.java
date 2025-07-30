package com.cmn_class;
/*
 * Wrapper class :Type conversion
 * conversion of non primitive type to primitive and vice a versa
 * 
 * 1. Auto boxing : direct value to object
 * 2. boxing: first value given to variable to object
 * 3. Unboxing :object to variable
 * 
 * Object : root class for all java class
 */

class Demo{
	public void show() {
		System.out.println("This is demo class");
	}
}
public class WrapperClassDemo {
public static void main(String[] args) {
	int a=12,b=0;
	//int/int = int
	
	System.out.println(a/b);
	
String str=new String("This is Tops Tech");
System.out.println(str);
Integer i1=new Integer(100);
System.out.println("Auto boxing :"+i1);
int i2=15120;
Integer i3=i2;
System.out.println("Boxing is :"+i3);

int i4=i3;
System.out.println("unboxing :"+i4);


String str1="10.5";
String str2="2";
String str3="9589408690586985";
String str4="95894086.454545";

float i5=Float.parseFloat(str1);
float i6=Integer.parseInt(str2);
long l1=Long.parseLong(str3);
double d1=Double.parseDouble(str4);
//float/float
System.out.println(i5/i6);

System.out.println(d1+l1);

int i7=150;
int i8=250;

String str5=String.valueOf(i7);
String str6=String.valueOf(i8);
System.out.println(str5+str6);

Demo dm=new Demo();
dm.show();
}
}
