package com.fibassignment;

import java.util.Scanner;

public class Fibonacci {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		//fibonacci series target 4
		
		 int n  , a = 0,b=1, c=1;
		 Scanner s = new Scanner(System.in);
		 System.out.print("enter value of n:");
		 n = s.nextInt();
		 System.out.print("fibonacci series:");
		 for(int i=1; i<=n; i++) {
		 
		 a=b;
		 b=c;
		 c=a+b;
		 System.out.print(a+" ");

		 //fibonacci series target 6
		 
		 int x , j = 0,k=1, l=1;
		 Scanner s1 = new Scanner(System.in);
		 System.out.print ("enter value of x:");
		 x = s.nextInt();
		 System.out.print ("fibonacci series:");
		 for(int d=1; i<=x; i++) {

		 j=k;
		 k=l;
		 l=j+k;
		 System.out.print(j+" ");

	}
		 
	}	   
}
}

