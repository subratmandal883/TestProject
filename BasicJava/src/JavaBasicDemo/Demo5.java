package JavaBasicDemo;

import java.util.HashMap;
import java.util.Map;

public class Demo5 {

	public static void main(String[] args) {
		char[] ch= {'a','b','c','d','a','b','c'};
		Map<Character,Integer> hm=new HashMap<>();
		for(char c:ch) {
			if(hm.containsKey(c)) {
				hm.put(c,hm.get(c)+1);
			}else {
				hm.put(c, 1);
			}
		}
		for(Map.Entry<Character,Integer> entry:hm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
