package stringOperations;

public class SwapTheStringCase {

	public static void main(String[] args) {
		String st="Today is Wednesday";
		String newString=" ";
		for(int i=0;i<st.length();i++) {
			char c=st.charAt(i);
			if(Character.isUpperCase(c)) {
				newString+=Character.toLowerCase(c);
			}else if(Character.isLowerCase(c)) {
				newString+=Character.toUpperCase(c);
			}else {
				newString+=c;
			}
		}
		System.out.println(newString);

	}

}
