package JavaBasicDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap();
		
		hm.put(101, "John");
		hm.put(102, "David");
		hm.put(103, "Scott");
		hm.put(104, "Mary");
		hm.put(105, "John");
		/*
		 * System.out.println(hm); System.out.println(hm.get(105));
		 * System.out.println(hm.containsKey(hm));
		 * System.out.println(hm.containsValue("Scott"));
		 * System.out.println(hm.containsValue("Man"));
		 * System.out.println(hm.isEmpty());
		 */
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		//System.out.println(hm.entrySet());
		for(Map.Entry entry:hm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
