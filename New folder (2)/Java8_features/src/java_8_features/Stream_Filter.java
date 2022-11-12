package java_8_features;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Stream_Filter {

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
			
			
			marks.stream().forEach(x -> System.out.print(x+" "));
			
			System.out.println();
			System.out.println();
			
			List<Integer> passMarks = marks.stream().filter( x -> x > 38 ).map(x -> x).collect(Collectors.toList());
			
			passMarks.stream().forEach(x -> System.out.print(x+" "));
			
			/*
			List<Integer> newMarks = new ArrayList<Integer>();
			Iterator<Integer> itrObj = marks.iterator();
			while(itrObj.hasNext()) {
				Integer x = itrObj.next();
				if(x > 38) {
					newMarks.add(x);
				}
			}
			
			Iterator<Integer> itr2 = newMarks.iterator();
			while(itr2.hasNext()) {
				System.out.println(itr2.next());
			}*/
			
	}



	}


