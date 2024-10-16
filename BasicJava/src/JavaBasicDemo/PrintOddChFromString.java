package JavaBasicDemo;

public class PrintOddChFromString {

	public static void main(String[] args) {
		String str = "Welcome to Javatpoint portal";          
		int strLength=str.length();
		for(int i=0;i<=strLength-1;i++) {
			
			if(i%2!=0) {
				System.out.println("This is odd "+i+ "and the index is :"+str.charAt(i));
			}
		}

	}

}
