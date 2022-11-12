package Q_And_A_3_Java8_Streams;

	
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streams_CharCount {

	public static void main(String[] args) {

		String course = "java";
		
		Map<String, Long> mapResults = Arrays.stream(course.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
		mapResults.entrySet().forEach(e -> System.out.println(e.getKey()+" -- "+e.getValue()));
		
	}

}

