package stringOperations;
public class ConvertUToLAndLToU {

	public static void main(String[] args) {
		String sen="This is India";
		String s=" ";
		for(int i=0;i<sen.length();i++) {
			char c=sen.charAt(i);
			if(Character.isUpperCase(c)) {
				s+=Character.toLowerCase(c);
			}else if(Character.isLowerCase(c)) {
				s+=Character.toUpperCase(c);
			}
			else {
				s+=c;
			}
			
		}
		System.out.println("New String :"+s);
	}

}
