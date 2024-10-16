package JavaBasicDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo6 {

	public static void main(String[] args) {
		char[] ch= {'a','b','c','d','a','b','c','m','o','p','p','a'};
		Map<Character, Integer> m=new HashMap<Character, Integer>();
		for(char c:ch) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
				
			}else {
				m.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer> m1:m.entrySet()) {
			System.out.println(m1.getKey()+" "+m1.getValue());
			
		}
		
		}

}
