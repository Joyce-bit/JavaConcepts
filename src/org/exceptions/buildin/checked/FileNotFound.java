package org.exceptions.buildin.checked;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileNotFound {
	
	// File not found Exception
	
	public static void main(String[] args) {
		
		System.out.println("Located the file from the path");
		
		FileReader fr = null;
		// fr = new FileReader("D:\\Personal\\Joyce\\FileNotFound");  This is throw compile time error
		
		// Thread.sleep(5000);  This will throw a compile time error
		
		System.out.println("Reading the line from the file");
		
		BufferedReader br = new BufferedReader(fr);
		// System.out.println(br.readLine());  This will throw a compile time error
		
		// Thread.sleep(5000);  This will throw a compile time error
	
	}

}
