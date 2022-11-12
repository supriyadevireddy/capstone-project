package com.InclassAssignment;

public class InterruptClient {

	public static  void main(String[] args) {
		System.out.println("starting of main method");
		InterruptDemoExtendsThread demoObj = new InterruptDemoExtendsThread();
		 demoObj.start();
		for(int i=1; i<=100; i++) {
			System.out.println("value of i in main is"+i+"executed by"+Thread.currentThread().getName());
		}
       System.out.println("Ending of main method");
	}

}
