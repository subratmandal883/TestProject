package JavaBasicDemo;

import java.util.Scanner;

public class Demo4  {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("hey please enter the number to count vowels count");
		char[] c= {'a','e','i','o','u'};
		int count=0;
		String str=scanner.nextLine();
		for(int i=0;i<str.length();i++) {
			char character=Character.toLowerCase(str.charAt(i));
			count++;
			if(character=='a') {
				System.out.println("a is present in the sentence "+count);
				
			}else if(character=='e'){
				System.out.println("e is present in the sentence "+count);
				
				}else if(character=='i'){
					System.out.println("i is present in the sentence "+count);
					
					}else if(character=='a'){
						System.out.println("a is present in the sentence "+count);
						
					}else if(character=='u'){
						System.out.println("u is present in the sentence "+count);	
					}
			
			}
		
		

					

}
}