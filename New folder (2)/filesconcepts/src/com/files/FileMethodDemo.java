package com.files;

import java.io.File;
import java.io.IOException;

public class FileMethodDemo {

	public static void main(String[] args) {
	
		String location="C:\\\\Users\\\\DELL  PC\\\\eclipse-workspace\\\\supriyaD\\\\sample.txt";
	
		File fileObj = new File(location);
		try {
			System.out.println("is file existed or not"+ fileObj.createNewFile());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
       
   try {
	   System.out.println("is filenewly created or not"+ fileObj.createNewFile());
	  
   }catch(IOException e) {
	   e.printStackTrace();
   }
   System.out.println("is location pointed to file or not"+ fileObj.isFile());
   System.out.println("is file deleted or not"+fileObj.delete());
   System.out.println("no of character in file are"+fileObj.length());
	}

}
