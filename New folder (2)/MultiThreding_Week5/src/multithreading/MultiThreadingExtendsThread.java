package multithreading;
//step1:Make the class on which we wish to create a new thread as eligible for multithreading
public class MultiThreadingExtendsThread {
//step3:definr the starting point for the newly created thread
	public void run() {
		System.out.println("starting of run method_"+Thread.currentThread().getName());
		display();
		System.out.println("Ending of main method_"+Thread.currentThread().getName());

	}

private void display() {
	// TODO Auto-generated method stub
	
	System.out.println("starting of run method_"+Thread.currentThread().getName());
	for(int j=1; j<=100; j++) {
		System.out.println("value of j in display method is"+j+"_"+Thread.currentThread().getName());
		
		
	
	}
	System.out.println("Ending of main method_"+Thread.currentThread().getName());
}

}
