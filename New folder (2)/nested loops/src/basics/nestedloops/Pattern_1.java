package basics.nestedloops;

import java.util.Scanner;

public class Pattern_1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		Object sytem;
		Object sysem;
		Readable system = null;
		Scanner scObj = new Scanner((Readable) system);
		System.out.println("please enter row size");
		int rowsize = scObj.nextInt();
		 
		System.out.println("please enter column size");
		int colsize = scObj.nextInt();
		
		scObj.close();
		
		displaypattern(rowsize,colsize);
	}	
	
	static void displaypattern(int rowsize,int colsize) {
	
	for(int row=1; row<=rowsize; row++) {
		for(int col=1; col<=colsize; col++){
			System.out.println("*************    ");
		}
	}
		}
	
}	


	

