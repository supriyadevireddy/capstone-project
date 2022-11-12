package com.files;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo_1 {

	public static void main(String[] args) {
		String location = "C:\\Users\\DELL  PC\\eclipse-workspace\\supriyaD\\sample.txt";
		
		File fileObj = new File(location);  
	    try {
	    	FileReader fReader = new FileReader(fileObj);
	    	BufferedReader buffReaderObj = new BufferedReader(fReader);
	    	String lineOfData = " ";
	    	while((lineOfData = buffReaderObj.readLine()) !=null){
	    		System.out.println(lineOfData);
	    	}
	    	buffReaderObj.close();
	    }catch(FileNotFoundException ex) {
	    	ex.printStackTrace();
	    }catch(IOException e) {
	    	e.printStackTrace();
	    }
		
		

	}

}
