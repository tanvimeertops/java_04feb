package com.fileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Character Stream : 2 byte/char 
 * FileWriter()
 * to write data into file
 * FileReader()
 * to read data from the file
 */
public class CharacterStreanDemo {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("file2.txt",true);
	String msg="\nThis is Tops Technologies";
	fw.write(msg);
	fw.flush();
	fw.close();
	System.out.println("data written");
	
	
	FileReader fr=new FileReader("file2.txt");
	int x;
	while((x=fr.read())!=-1) {
		System.out.print((char)x);
	}
}
}
