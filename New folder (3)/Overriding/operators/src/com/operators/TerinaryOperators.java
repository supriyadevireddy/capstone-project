package com.operators;

public class TerinaryOperators {

	public static void main(String[] args) {
		
		displayDisignation(5);
	}
	static void displayDisignation(int expression) {
		//(condition) ? " ":" "
		 
		
	
   String result = (expression<=3) ? "junior level software engineer" : "software engineer";
    
   System.out.println(result);
     
   /*if (expression<=3){
    * Sytem.out.println("junior level software engineer");
    * }else{
    * System.out.println("software engineer");
    * 
    */
	}

}
