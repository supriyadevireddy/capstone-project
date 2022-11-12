package com.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		
		String location = "C:\\Users\\DELL  PC\\eclipse-workspace\\supriyaD\\sample.txt";
		File fileObj = new File(location);
		
		try {
			PrintWriter pwObj = new PrintWriter(fileObj);
			pwObj.println(90);
			pwObj.println("harsha");
			pwObj.println(10.4);
			pwObj.println(true);
			pwObj.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("content written to file successfully");

	}

}
