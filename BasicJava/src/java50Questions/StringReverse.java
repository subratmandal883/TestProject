package java50Questions;

public class StringReverse {


	public static void main(String[] args) {
		String name="Good Morning";
		String rev=" ";
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			rev=c+rev;
		}
		System.out.println(rev);

	}

}
