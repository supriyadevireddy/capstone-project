package java_8_features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Sorted {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Integer> descComp = (i1, i2) -> {
			return -(i1.compareTo(i2));
		};

		Comparator<String> revAlpha = (i1, i2) -> {
			return -(i1.compareTo(i2));
		};

		List<Integer> marks = new ArrayList<Integer>();

		marks.add(90);
		marks.add(80);
		marks.add(90);
		marks.add(45);
		marks.add(30);

		// List<Integer> sortedMarks = marks.stream().sorted().map(x ->
		// x).collect(Collectors.toList());
		List<Integer> sortedMarks = marks.stream().sorted(descComp).map(x -> x).collect(Collectors.toList());

		sortedMarks.stream().forEach(x -> System.out.print(x + " "));

	}

}
