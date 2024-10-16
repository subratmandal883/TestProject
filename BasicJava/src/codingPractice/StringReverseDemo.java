package codingPractice;

public class StringReverseDemo {

	public static void main(String[] args) {
		String name="my name is subrat";
		String rev=" ";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			rev=ch+rev;
		}
System.out.println(rev);

	}

}
