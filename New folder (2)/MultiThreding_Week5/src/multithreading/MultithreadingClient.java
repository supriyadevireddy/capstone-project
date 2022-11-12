package multithreading;

public class MultithreadingClient {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("starting of main method_"+Thread.currentThread().getName());
        MultithreadingClient demoObj = new MultithreadingClient();
        //step2:create and start a new thread through calling thread class start method
        for (int i=1; i<=10; i++) {
        	System.out.println("value of j in display method is"+i+"_"+Thread.currentThread().getName());

        }
      System.out.println("Endig of main method_"+Thread.currentThread().getName());
	}
void m1() {
	System.out.println("this is m1");
}
}
