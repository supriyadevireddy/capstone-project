package multithreading;

public abstract class ImplimentsRunnableClient implements Runnable  {

	public static void main(String[] args) {
		System.out.println("starting of main method");
		//Step2:create and start a new Thread through calling Thread class start method 
		ImplimentsRunnableClient demoObj = null;
		Thread tObj = new Thread(demoObj);
		tObj.start();
		for(int i=1; i<=100; i++) {
			System.out.println("value of i in main method is"+i);
		}
		System.out.println("Ending of main method");	

	}

}
