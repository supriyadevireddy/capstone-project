package basic.splitmethod;

public class WordsCountSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String sentence = "india clinches towards victory";
    
    int wordscount =0;
    
    for(int i=0; i<sentence.length()-1; i++) {
    	char ch = sentence.charAt(i);
    	
    if(ch== ' '  && sentence.charAt(i+1)!= ' ') {
    	wordscount++;
    }
    }
    wordscount++;
    System.out.println("no of words given sentence are "+wordscount);
    
	}

}
