package digitalOcean50Code;

public class VowelsPresent {
//3. Write a Java program to check if a vowel is present in a string.
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		StringBuffer result = null;
		// TODO Auto-generated method stub
		String sen="my name is khali";
		int vowels=0;
		
		for(int i=0;i<sen.length();i++) {
			char c=sen.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowels++;
			
			 result=sb.append(c);
			}
			 else {
			
			 }
		}
	
		System.out.println("vowels is present in sentence is :"+ vowels +" and character is :" +result.toString());

	}

}
