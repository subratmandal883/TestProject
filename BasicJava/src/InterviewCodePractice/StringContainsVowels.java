package InterviewCodePractice;

public class StringContainsVowels {

	public static void main(String[] args) {
		
		System.out.println(StringContainsVowels("Hello"));
		System.out.println(StringContainsVowels("TV"));
	}
	
	public static boolean StringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

}
