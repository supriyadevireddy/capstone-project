package com.InclassAssignment;

public class InterruptDemoExtendsThread {
public void display() {
	System.out.println("starting of display method");
	for (int j=1; j<=100; j++) {
		System.out.println("value of j in display method is"+j);
		if(j==40) {
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	System.out.println("Ending of main method");
}
public void run() {
	display();
}
public void start() {
	// TODO Auto-generated method stub
	
}
}
