package com.synchronize;

public class ThreadSynchronizationClient {

	public static void main(String[] args) {
		ThreadSynchronizationDemo demoObj = newThreadSynchronizationDemo();
		ThreadSynchronizationDemo demoObj2 = newThreadSynchronizationDemo();
       
		Thread tObj1=new Thread(demoObj);
		tObj1.start();
		Thread tObj2=new Thread(demoObj2);
		tObj2.start();

	}

	private static ThreadSynchronizationDemo newThreadSynchronizationDemo() {
		// TODO Auto-generated method stub
		return null;
	}

}
