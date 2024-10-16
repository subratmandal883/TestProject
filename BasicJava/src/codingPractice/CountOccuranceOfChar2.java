package codingPractice;

public class CountOccuranceOfChar2 {
//count char each occurance
	public static void main(String[] args) {
		String word="Hello Welcome to earth"; 
		int len=word.length();
		word=word.toLowerCase();
		int[] count=new int[400];
		for(int i=0;i<len;i++) {
			count[word.charAt(i)]++;
		}
		for(int i=0;i<400;i++) {
			if(count[i]>0) {
				System.out.println((char)i+"-->"+count[i]);
			}
		}
		
	}

}
