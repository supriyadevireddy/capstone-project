package multithreading;

public class SingleThreadingClient {

	public static void main(String[] args) {
		System.out.println("starting of main method_"+Thread.currentThread().getName());
        for(int j=1; j<=10; j++) {
        	System.out.println("value of j in display method is"+j+"_"+Thread.currentThread().getName());
        	
        }
        System.out.println("Ending of main method_"+Thread.currentThread().getName());
        
        
        
        
        
	}

}
