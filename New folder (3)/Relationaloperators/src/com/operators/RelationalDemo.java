package com.operators;

public class RelationalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using relational operators >,>=,<,<=,==,!=
		
		int a=22;
		int b=44;
		
		if(a>b) {
			System.out.println("a is smaller");
		}
		else {
			System.out.println("b is greater");
			
			/*using relational operators >,>=,<,<=,==,!=
result boolean value */
			System.out.println(a>b);//false
			System.out.println(a>=b);//false
			System.out.println(a<b);//true
			System.out.println(a<=b);//true
			System.out.println(a==b);//false
			System.out.println(a!=b);//true
			
            
		}
	}

}
