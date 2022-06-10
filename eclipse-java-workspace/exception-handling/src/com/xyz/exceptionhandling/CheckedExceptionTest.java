package com.xyz.exceptionhandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		File file = new File("hello.txt");
		try {
			Scanner scanner = new Scanner(file);
			String str = scanner.nextLine();
			System.out.println(str);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
