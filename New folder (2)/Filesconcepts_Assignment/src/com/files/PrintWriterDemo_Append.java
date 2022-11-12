package com.files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo_Append {

public static void main(String[] args) {
		
		String location = "C:\\Users\\DELL  PC\\eclipse-workspace\\supriyaD\\sample.txt";
		File fileObj = new File(location);
		
		try {
			FileWriter fwObj = new FileWriter(fileObj,true);
			PrintWriter pwObj = new PrintWriter(fwObj);
			
			pwObj.println("hi sir");
			pwObj.println("how are you!!");
			pwObj.println(10000);
			pwObj.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("successfully appended the data  to the file");

	}
	}

