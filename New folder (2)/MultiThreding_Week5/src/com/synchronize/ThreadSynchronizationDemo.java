package com.synchronize;

public abstract class ThreadSynchronizationDemo implements Runnable {
public void run() {
	display();
}
public synchronized void display() {
	for(int i=1;i<=50; i++) {
		System.out.println("value of i in display method is "+i+"_"+Thread.currentThread().getName());
	}
}
}
