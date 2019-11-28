package com.ustglobal.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingClass {//start of class
	
	public static void main(String[] args) { //start of main
		
		
		
		String path = "C:\\Users\\Monu\\Desktop\\text.txt";
		FileReader reader = null;
		
		try {
			 reader = new FileReader(path);
			 int i;
			 while( (i = reader.read()) != -1) {
				 System.out.print((char)i);
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}//end of main

}//end of class
/*
 * NOTES
 * -----
 * character :
 * text only.
 * 
 * file reader/file writer
 * bufferedReader/BufferedWriter
 * Reader/Writer: abstract classes which is been implemented by the above two classes.
 * 
 * return int which is ASCII code of single charcater.
 * 
 * 
 * byte:
 * 
 * all type of files.
 * FileInputStream
 * InputStream 
 * byte value of the content.
 * 
 * 
 * 
 * */
 