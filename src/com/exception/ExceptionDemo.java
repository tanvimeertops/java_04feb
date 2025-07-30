package com.exception;
/*
 * Exception: any abnormal condition
 * It is a root class for all the exception class
 * Error :
 * compile time  : missing ;}
 * runtime : NumberFormatException,ArithmeticException
 * error :developer mistake, not as per requirement
 * 
 * try : if we have doubt in any line of code that code might give exception then 
 * keep it in try block
 * 1. it will skip the error code and show remaining code
 * 2. try followed by catch and finally or both
 * catch : to catch exception
 * to trace to the exception
 * throw 
 * throws
 * finally : whether error is there or not finally block will execute
 * 
 * 
 */
public class ExceptionDemo {
public static void main(String[] args) {
	
	int a1=10,a2=0;
	
	try {
		System.out.println(a1/a2);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	finally {
		System.out.println("This code is written BY TANVI");
		System.out.println("For query contact :5656565699");
	}
	

}
}
