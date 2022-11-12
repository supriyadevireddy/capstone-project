package com.files;

import java.io.File;

public class FilesAndFolders {

	public static void main(String[] args) {
		
		int filescount = 0;
		int foldercount = 0;
		
		String location ="C:\\Program Files\\Java\\jdk-18.0.1.1";
		File fileObj = new File(location);
		String[] namesOfAllItems = fileObj.list();
		System.out.println("no of items present in given location are"+namesOfAllItems.length);
		for(String itemName: namesOfAllItems) {
			String individualItemLocation = location.concat(itemName);
			File individualfileObj = new File(individualItemLocation);
			if(individualfileObj.isFile()) {
				filescount++;
				
			}else {
				foldercount++;
			}
		}
        System.out.println("no of items as files are"+filescount);
        System.out.println("no of items as folders are"+foldercount);
	}



	}


