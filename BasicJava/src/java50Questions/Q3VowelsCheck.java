package java50Questions;

public class Q3VowelsCheck {
//3. Write a Java program to check if a vowel is present in a string.
	public static void main(String[] args) {
		String v="this is subrat mandal";
		int count=0;
		for(int i=0;i<v.length();i++) {
			char c=v.charAt(i);
			if(i=='a'|| i=='e'||i=='i'||i=='o'||i=='u')
				count++;
			{System.out.println(i);
			}
		}

	}

}
