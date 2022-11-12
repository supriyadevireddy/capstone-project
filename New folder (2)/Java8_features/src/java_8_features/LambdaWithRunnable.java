package java_8_features;

public class LambdaWithRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Starting of main method - "+Thread.currentThread().getName());
		
		Runnable rObj = () -> {
								System.out.println("starting of run method");
								 display();
								System.out.println("ending of run method");
							  };
							  
        Thread tObj = new Thread(rObj);
        tObj.start();
		
		
		for(int i=1; i<=100; i++) {
			System.out.println("value of i in main method is "+i+" - "+Thread.currentThread().getName());
			if(i == 70) {
				try {
					tObj.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("Ending of main method - "+Thread.currentThread().getName());
		
	}
	
	static void display() {
		System.out.println("starting of display method - "+Thread.currentThread().getName());
		
		for(int j=1; j<=100; j++) {
			System.out.println("value of j is "+j+" - "+Thread.currentThread().getName());
		}
		
		System.out.println("ending of display method - "+Thread.currentThread().getName());
	}



	}


