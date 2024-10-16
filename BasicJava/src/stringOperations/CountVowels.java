package stringOperations;

public class CountVowels {

	public static void main(String[] args) {
		String n="India is my country";
		int count=0;
		
		for(int i=0;i<n.length();i++) {
			char c=n.charAt(i);
			c=Character.toLowerCase(c);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') 
				count++;
		}
		System.out.println("count is :"+count);
	}

}
