package JavaBasicDemo;

public class CountTheNumFromString {

	public static void main(String[] args) {
		String st = "this is 4.30 pm, you can call me 5.56 pm";
		int n=CountTheNumFromString.findtheNumber(st);
		System.out.println(n);
	}
	
	public static int findtheNumber(String sentence) {
		int count=0;
		for(int i=0;i<sentence.length();i++) {
			
			if(Character.isDigit(sentence.charAt(i))) {
				count++;
			}
		}
		return count;
		
	}

}
