package New50JavaPractice;

public class StringReverseDemo2 {

	public static void main(String[] args) {
		String name="this is all my application";
		String rev=" ";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			rev=ch+rev;
		}

		System.out.println(rev);
	}

}
