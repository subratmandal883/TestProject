package SimplyCoding;

public class FindConstantAndVowels {

	public static void main(String[] args) {
		String input="Hello world";
		int vowels=0;
		int constants=0;
		input=input.toLowerCase();
		
		for(char c: input.toCharArray()) {
			if(c>='a' && c<='z') {
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					vowels++;
				}else {
					constants++;
				}
			}
		}
		System.out.println("vowels:"+vowels);
		System.out.println("constants:"+constants);
	}

}
