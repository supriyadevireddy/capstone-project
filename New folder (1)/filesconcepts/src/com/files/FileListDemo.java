package com.files;

import java.io.File;

public class FileListDemo {

	public static void main(String[] args) {
		String location = "C:\\\\Users\\\\DELL  PC\\\\eclipse-workspace\\\\supriyaD\\\\sample.txt";
        File fileObj = new File(location);
        String[] namesOfAllItems = fileObj.list();
        System.out.println("no of items present in given location are"+namesOfAllItems.length);
        
        for(String itemname : namesOfAllItems) {
        	String individualItemlocation = location.concat(itemname);
        	System.out.println(individualItemlocation);
        }

	}

}
