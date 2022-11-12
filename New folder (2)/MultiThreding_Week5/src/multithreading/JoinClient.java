package multithreading;

public class JoinClient {
	public static  void main(String[] args, Thread DemoObj) {
		System.out.println("starting of main method is"+Thread.currentThread().getName());
		DemoObj.start();
for(int i=1; i<=100; i++) {
	System.out.println("value of i in main method is"+i+"_"+Thread.currentThread().getName());
	if(i==30) {
		try {
			DemoObj.join();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}//when the value of i in main method reached 30,main thread will stop till joindemo program thread Excecution completes
		System.out.println("Ending of main method_"+Thread.currentThread().getName());
	}
}
	}

}
