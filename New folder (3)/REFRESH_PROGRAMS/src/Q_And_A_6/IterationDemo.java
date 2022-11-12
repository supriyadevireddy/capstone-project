package Q_And_A_6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//Write a java program to iterate on ArrayList using for loop, while loop and forEach loop
public class IterationDemo {

	public static void main(String[] args) {

		List<Integer> marks = Arrays.asList(10, 20, 30, 40);
		
		System.out.println(" ----------- REGULAR ITERATOR --------------");
		Iterator<Integer> itrObj = marks.iterator();
		while(itrObj.hasNext()) {
			System.out.println(itrObj.next());
		}
		
		System.out.println(" ---------- JAVA8 STREAMS FOR EACH METHOD --------------");
		
		marks.stream().forEach(x -> System.out.println(x));
		
		System.out.println("--------- FOR EACH LOOP -----------");
		
		for(int x : marks) {
			System.out.println(x);
		}
		
		System.out.println(" ---------- FOR LOOP -------- ");
		
		for(int i=0; i<marks.size(); i++) {
			System.out.println(marks.get(i));
		}
		
		System.out.println(" ------- WHILE LOOP ------- ");
		int j =0;
		while(j<marks.size()) {
			System.out.println(marks.get(j));
			j++;
		}
		
		
		
	}

}

