package com.files;

import java.io.File;

public class FileListDemo_2 {

	public static void main(String[] args) {
		int filescount = 0;
		int foldercount = 0;
		
		String location ="import java.io.BufferedReader;\r\n"
				+ "import java.io.File;\r\n"
				+ "import java.io.FileNotFoundException;\r\n"
				+ "import java.io.FileReader;\r\n"
				+ "import java.io.IOException;\r\n"
				+ "\r\n"
				+ "public class BufferedReaderDemo {\r\n"
				+ "\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "		String location = \"C:\\\\Users\\\\DELL  PC\\\\eclipse-workspace\\\\supriyaD\\\\sample.txt\";\r\n"
				+ "		\r\n"
				+ "		File fileObj = new File(location);  \r\n"
				+ "	    try {\r\n"
				+ "	    	FileReader fReader = new FileReader(fileObj);\r\n"
				+ "	    	BufferedReader buffReaderObj = new BufferedReader(fReader);\r\n"
				+ "	    	boolean lineofData = \" \" != null;\r\n"
				+ "	    	while(lineofData = buffReaderObj.readLine() != null){\r\n"
				+ "	    		System.out.println(lineofData);\r\n"
				+ "	    	}\r\n"
				+ "	    	buffReaderObj.close();\r\n"
				+ "	    }catch(FileNotFoundException ex) {\r\n"
				+ "	    	ex.printStackTrace();\r\n"
				+ "	    }catch(IOException e) {\r\n"
				+ "	    	e.printStackTrace();\r\n"
				+ "	    }\r\n"
				+ "		\r\n"
				+ "		\r\n"
				+ "\r\n"
				+ "	}\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "";
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
