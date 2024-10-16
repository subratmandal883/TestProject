package stringProblems;

public class FIndTheSpace {
  static int count=0;
	public static void main(String[] args) {
		String s="Good Morning guys today is Monday!";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				
				 count++;
				
			}
			
		}
		System.out.println(count);
		
		

	}

}
