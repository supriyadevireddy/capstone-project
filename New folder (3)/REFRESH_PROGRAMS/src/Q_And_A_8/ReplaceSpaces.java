package Q_And_A_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReplaceSpaces {

	public static void main(String[] args) {

		String sentence = "I am learning     java";
		
		//String output = sentence.replaceAll("\\s", "");
		
		//System.out.println(output);
		
		StringBuilder sb = new StringBuilder("");
		
		for(int i=0; i<sentence.length(); i++) {
			  char ch = sentence.charAt(i);
			  if(ch != ' ') {
				  sb.append(ch);
			  }
		}
		
		String output = sb.toString();
		
		System.out.println(output);
		
		List<String> result = Arrays.stream(sentence.split("")).filter(x -> !(x.equals(" "))).collect(Collectors.toList());
		
		String output2 = String.join("", result);
		
		System.out.println(output2);
		
		
	}

}

