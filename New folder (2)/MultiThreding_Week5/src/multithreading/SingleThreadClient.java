package multithreading;

public class SingleThreadClient {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("starting of main method_"+Thread.currentThread().getName());
		SingleThreadClient demoObj = new SingleThreadClient();
		for (int i=1; i<=10; i++) {
			System.out.println("value of main method is"+i+"_"+Thread.currentThread().getName());
		}
		System.out.println("Ending of main method");

	}

}
