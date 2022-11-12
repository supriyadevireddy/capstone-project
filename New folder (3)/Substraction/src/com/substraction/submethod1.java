package com.substraction;

public class submethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double r1 = subtraction(3.5,4);
    
    System.out.println("output recieved to main method is"+r1);
	}

	private static double subtraction(double num1, int num2) {
		System.out.println("input recieved are"+num1+" and "+num2);
		double result =num1-num2;
		return result;
	}

}
