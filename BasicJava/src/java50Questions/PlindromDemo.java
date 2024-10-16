package java50Questions;

public class PlindromDemo {

	public static void main(String[] args) {
		String str="121";
		String dup=str;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			sb.append(c).reverse().toString();
			
		}
		if(sb.equals(dup)) {
			System.out.println("this is palindrom");
		}else {
			System.out.println("this is not palindrom");
		}
		
		
	}

}
