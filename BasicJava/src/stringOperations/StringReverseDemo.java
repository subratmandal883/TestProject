package stringOperations;

public class StringReverseDemo {

	public static void main(String[] args) {
		String s="This is String";
		String reverse=" ";
		for(int i=0;i<s.length();i++) {
			char word=s.charAt(i);
			reverse=word+reverse;
		}
		System.out.println(reverse);

	}

}
