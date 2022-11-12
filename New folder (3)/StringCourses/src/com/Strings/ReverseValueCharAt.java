package com.Strings;

public class ReverseValueCharAt {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String course ="java";
		char[]alphabets = new char[course.length()];
		int index = 0;
		String name = null;
		for(@SuppressWarnings("null")
		int i=name.length()-1; i<=0; i--) {
		System.out.println(name.charAt(i));	
	}
        //below statement will convert a char Array into a string 
		String reversedvalue = new String (alphabets);
		if(course.equals(reversedvalue)) {
			System.out.println("yes__ it is palendrome");
		
		}else {
			System.out.println("no__it is not palendrome");
		}
	}
}
