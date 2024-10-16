package digitalOcean50Code;

public class PalindromeNumber {
//7. How do you check whether a string is a palindrome in Java?
	public static void main(String[] args) {
		int n=1121;
		int r=0,s=0;
		int dup=n;
		
		for(int i=0;i<n;i++) {
			
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(dup==s) {
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}
				
		
	
		
		 
	}

}
