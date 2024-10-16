package JavaBasicDemo;

public class StringDemo {

	public static void main(String[] args) {
		String s = "Its Simple 12.30";
		int count = 0;
		int countlw = 0;
		int countdigit=0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char c=s.charAt(i);
			if(Character.isUpperCase(c)) 
				count++;
			if(Character.isLowerCase(c)) 
				countlw++;
			if(Character.isDigit(c))
				countdigit++;
		}
		System.out.println(count+" Upper");
		System.out.println(countlw+" lower");
		System.out.println(countdigit+" countdigit");
	}

}
