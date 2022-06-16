package com.xyz.filehandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) {

		try {
//			Reader input = new FileReader("hello.txt");
////			int c;
////			while((c=input.read())!=-1) {
////				System.out.print((char)c);
////			}
////			Scanner scan = new Scanner(input);
////			while(scan.hasNextLine()) {
////				String line = scan.nextLine();
////				System.out.println(line);
////			}
//
//			BufferedReader reader = new BufferedReader(input);
////			while (true) {
////				String line = reader.readLine();
////				if (line == null) {
////					break;
////				}
////				System.out.println(line);
////			}
			
			// reader.lines().map(line->line.toUpperCase()).forEach(System.out::println);
			
			Files.lines(Paths.get("hello.txt")).forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
