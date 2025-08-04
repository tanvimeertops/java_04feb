package com.fileIO;
/*
 * File is a class
 */

import java.io.File;
import java.io.IOException;

class FDemo{
	File file;
	public FDemo() throws IOException {
		file=new File("file3.txt");
		file.createNewFile();
		display();
	}
	
	public void display() {
		System.out.println("can read file :"+file.canRead());
		System.out.println("can write file :"+file.canWrite());
		System.out.println("can execute file :"+file.canExecute());
		System.out.println("file name: "+file.getName());
		System.out.println("file path: "+file.getPath());
		System.out.println("file name: "+file.getAbsolutePath());
	
	}
}
public class FileDemo {
public static void main(String[] args) throws IOException {
	new FDemo();
}
}
