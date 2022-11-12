package com.InclassAssignment;

public class ThreadSleepDemo {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			System.out.println("value of i is"+i);
			if(i==5) {
				try {
					Thread.sleep(5000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
