package com.files;

import java.io.File;

public class FoldersDemo {

	public static void main(String[] args) {
		String location = "C:\\\\Users\\\\DELL  PC\\\\eclipse-workspace\\\\supriyaD\\\\sample.txt";
	File fileObj = new File(location);
	
	System.out.println("is location pointed to folder or not"+fileObj.isDirectory());
    System.out.println("is new folder created or not"+fileObj.mkdir());
	System.out.println("is folder deleted or not"+fileObj.delete());
	}

}
