package com.fileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * File is a class 
 * Byte Stream
 * FileOutputStream 
 * to write into the file
 * FileInputStream
 * to read from the file
 * 
 * must have error:
 * IOException
 * FileNotFound
 * Character Stream
 * 
 */
public class ByteStreamDemo {
public static void main(String[] args) throws Exception {
	//to create and open file
	FileOutputStream fos=new FileOutputStream("file1.txt",true);
	String msg="plaease contact admin";
	//to write into the file
	byte[] b1=msg.getBytes();
	fos.write(b1);
	//to flush all data
	fos.flush();
	//to close file
	fos.close();
	System.out.println("data written...");
	
}
}
