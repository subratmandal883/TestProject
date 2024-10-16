package SimplyCoding;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String s="How to find the word";
		
		StringTokenizer st=new StringTokenizer(s, " ");
		while(st.hasMoreTokens()) {
			String c =st.nextToken();
			int l=c.length();
			System.out.println("["+c+"] and the length is :"+l);
			
		}
		
	}

}
