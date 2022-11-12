package java_8_features;

import java.util.Set;
import java.util.TreeSet;

public class Stream_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<Integer> marks = new TreeSet<Integer>();
			
			marks.add(90);
			marks.add(80);
			marks.add(90);
			marks.add(45);
			marks.add(30);
			marks.add(20);
			marks.add(49);
			
	
		 long countReceived = marks.stream().filter(x -> x > 38).count();	
			
		 System.out.println(countReceived);
	}

}
