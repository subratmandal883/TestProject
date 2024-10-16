package SimplyCoding;

import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
    	
    	String input="hello world";
    	HashMap<Character, Integer> freqMap=new HashMap<Character, Integer>();
    	for(char r: input.toCharArray()) {
    		freqMap.put(r,freqMap.getOrDefault(r, 0)+1);
    	}
    	System.out.println(freqMap);
    }
}

