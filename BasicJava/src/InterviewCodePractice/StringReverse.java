package InterviewCodePractice;

public class StringReverse {

	public static void main(String[] args) {
		//code shows one way to reverse a string:
		String word="Happy to Help you";
		StringBuilder sb=new StringBuilder();
		sb.append(word);
		sb.reverse();
		System.out.println(sb);
	}

}
