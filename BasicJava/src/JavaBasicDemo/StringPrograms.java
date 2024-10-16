package JavaBasicDemo;

public class StringPrograms {

	public static void main(String[] args) {
		String name="1234";
		String rev=" ";
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			rev=c+rev;
		}
	System.out.println(rev);
	}
}
