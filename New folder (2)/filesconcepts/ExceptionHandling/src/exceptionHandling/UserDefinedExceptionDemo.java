package exceptionHandling;

import java.util.Scanner;

public class UserDefinedExceptionDemo {

	

	public static void main(String[] args) {
		
   int availableBalance = 1000; 
   Scanner sc = new Scanner(System.in);
   System.out.println("please enter requested amount to withdraw");
   int requestedAmount = sc.nextInt();
   sc.close();
   if(requestedAmount > availableBalance) {
	   
   }
    availableBalance = availableBalance - requestedAmount;
    System.out.println("Balance left out is "+availableBalance);
	
		
	}

	
		
	}

