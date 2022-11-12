package java_8_features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_Arrays {

	public static void main(String[] args) {
		
		Comparator<Integer> descComp = (i1, i2) -> {
			return -(i1.compareTo(i2));
		};
		
		List<Integer> marks = new ArrayList<Integer>();

		marks.add(90);
		marks.add(80);
		marks.add(99);
		marks.add(45);
		marks.add(30);

		List<Integer> sortedMarks = marks.stream().sorted(descComp).map(x -> x).collect(Collectors.toList());
		
		List<Integer> topMarks = sortedMarks.stream().limit(2).collect(Collectors.toList());
		
		topMarks.forEach(x -> System.out.print(x+" "));
		
		
		
	}




	}


