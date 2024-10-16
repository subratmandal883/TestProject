package arrayProblems;


import java.util.HashSet;
import java.util.Set;



public class FindTheUniqueChar {

	public static void main(String[] args) {
		String s = "Hello";
		char[] ch=s.toCharArray();
       Set<Character> charArray=new HashSet<Character>();
       for(Character i:ch) {
    	   
    	   charArray.add(i);
       }
       System.out.println(charArray);
	}

}
