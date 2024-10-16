package lambdaExpDemoTwo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindLengthofElements {

	public static void main(String[] args) {
		List<Character> vehicles= Arrays.asList('b','c','b','f','t');
		Map<Character, Integer> m=new HashMap<Character, Integer>();
		for(Character v:vehicles) {
			if(m.containsKey(v)) {
				m.put(v, m.get(m)+1);
				
			}else {
				m.put(v, 1);
			}
		}for(Map.Entry<Character,Integer > ent:m.entrySet()) {
			System.out.println(ent);
		}
	}

}
