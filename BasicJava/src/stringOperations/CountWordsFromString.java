package stringOperations;

public class CountWordsFromString {

	public static void main(String[] args) {
		String words 	= "This is India";
		int countWord	= words.split("\\s").length;
		System.out.println(countWord);	
		}
	}


