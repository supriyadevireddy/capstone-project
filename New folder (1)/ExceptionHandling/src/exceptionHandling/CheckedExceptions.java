package exceptionHandling;

import java.io.File;
import java.io.IOException;

public class CheckedExceptions {

	public static void main(String[] args) {
		
   // System.out.println(10/0);
    String location = "c:/supriya/personal/work/work/work_space/odin_Fso4_corejava/demo/sample.txt";
    File fileObj = new File(location);
    
    try {
    	try {
			fileObj.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    	System.out.println("successfully file is created");
    }catch(ClassCastException ex) {
    	System.out.println();
    }
	}

}
