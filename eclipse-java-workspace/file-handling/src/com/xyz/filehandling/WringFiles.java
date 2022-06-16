package com.xyz.filehandling;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class WringFiles {
	
	public static void main(String[] args) {
		
		try {
			// OutputStream output = new FileOutputStream("message.txt");
			
			Writer writer = new FileWriter("message.txt",true);
			
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			
			bufferedWriter.write("Java has different ways to deal with I/O");
			
			bufferedWriter.close();
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
