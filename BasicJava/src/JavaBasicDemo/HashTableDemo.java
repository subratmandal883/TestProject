package JavaBasicDemo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(101, "John");
		ht.put(102, "David");
		ht.put(103, "Scott");
		ht.put(104, "Mary");
		ht.put(105, "John");

		//System.out.println(ht);
		//ht.remove(105);
		//System.out.println(ht);
		/*
		 * System.out.println(ht.containsKey(105));
		 * System.out.println(ht.containsValue("David"));
		 * System.out.println(ht.isEmpty()); System.out.println(ht.keySet());
		 * System.out.println(ht.values()); System.out.println(ht.entrySet());
		 */
		
		/*
		 * Set s=ht.entrySet();
		 * 
		 * Iterator m =s.iterator(); while(m.hasNext()) { Map.Entry<Integer, String>
		 * entry=(Entry<Integer, String>) m.next();
		 * System.out.println(entry.getKey()+" "+entry.getValue()); }
		 */
		
		for(Entry<Integer, String> k:ht.entrySet()) {
			System.out.println(k);
		}
	}

}
