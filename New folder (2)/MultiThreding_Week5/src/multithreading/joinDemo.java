package multithreading;

public interface joinDemo {
	public static   void run() {
		for(int j=1; j<=100; j++) {
			System.out.println("value of j in run is"+j+"_"+Thread.currentThread().getName());
		}
	}

	public void start();

	public void join();

}
