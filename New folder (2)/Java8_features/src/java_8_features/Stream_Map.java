package java_8_features;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Stream_Map {

	public static void main(String[] args) {
Set<Integer> marks = new TreeSet<Integer>();
		
		marks.add(90);
		marks.add(80);
		marks.add(90);
		marks.add(45);
		marks.add(30);
		
		System.out.print(" original marks : ");
		marks.stream().forEach(x -> System.out.print(x+" "));
		
		System.out.println();
		System.out.print(" bonus marks : ");
		//marks.stream().forEach(x -> System.out.print( (x+10) +" " ));
		
		Set<Integer> bonusMarks = marks.stream().map(x -> x+10).collect(Collectors.toSet());
		bonusMarks.stream().forEach(x -> System.out.print(x+" "));
		
	}



// original marks : 30 45 80 90
// updated marks  : 40 55 90 100















// TODO Auto-generated method stub

	}


