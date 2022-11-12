package multithreading;

public class MultiThreadDemo2ExtendsThread {
public void run() {
	System.out.println("starting of run method in MultiThreadingDemo2 program_"+Thread.currentThread().getName());
for(int k=1; k<=100; k++) {
	System.out.println("value of k in run method of MultiThreadingDemo2 program is"+k+"__"+Thread.currentThread().getName());

}
System.out.println("Ending of run methodin MultiThreadingDemo2 program_"+Thread.currentThread().getName());
}
}
