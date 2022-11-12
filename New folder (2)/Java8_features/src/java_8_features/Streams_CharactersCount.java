package java_8_features;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams_CharactersCount {

	public static void main(String[] args) {

		String course = "java";
		
		Map<String, Long> mapResults = Arrays.stream(course.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
		mapResults.entrySet().forEach(e -> System.out.println(e.getKey()+" -- "+e.getValue()));
		
	}
}