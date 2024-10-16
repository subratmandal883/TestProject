package JavaBasicDemo;

import java.util.Arrays;

public class StringAnagramDemo {

	public static void main(String[] args) {
		String str1 = "silent";
        String str2 = "listen";
        StringAnagramDemo sad=new StringAnagramDemo();
        sad.ana("silent", "listen");

	}
	
	public void ana(String str1,String str2) {
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean result;
		if(Arrays.equals(ch1,ch2)) {
			System.out.println("this is anagrams");
		}else {
			System.out.println("this is not");
		}
		
		
	}

}
