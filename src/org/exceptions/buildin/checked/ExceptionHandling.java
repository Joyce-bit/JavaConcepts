package org.exceptions.buildin.checked;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {
	// Exception Handling using throws keyword in the main method
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println("Program starts");
		
		Thread.sleep(5000);
		
		System.out.println("Program ends");
		
		System.out.println("Located the file from the path");
		
		FileReader fr = null;
		fr = new FileReader("D:\\Personal\\Joyce\\FileNotFound\\file_not_found.txt");
		
		Thread.sleep(5000);
		
		System.out.println("Reading the line from the file");
		
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		
		Thread.sleep(5000);
	
	}

}
