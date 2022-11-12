package com.palendromedemo;

import java.util.Scanner;

public class PalendromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter input");
    String input = sc.next();
    sc.close();
    
    char[]alphabets = new char[input.length()];
    int index  = 0;
    
    for (int i=input.length()-1; i<=0; i--){
    	alphabets[index]=input.charAt(i);index++;
    
    	
    }
    //below statements will convert a char array in to a string 
    String reversedvalues = new String(alphabets);
    
    if(input.equals(reversedvalues)){
    	System.out.println("yes__it is palendrome");
    	
    }else {
    	System.out.println("noo__it is not palendrome");
    }
    
	}

}
