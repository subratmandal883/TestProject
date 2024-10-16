package JavaBasicDemo;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		
		hs.add(100);
		hs.add("Welcome");
		hs.add(16.4);
		hs.add("A");
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);//null, A, 100, 16.4, Welcome, true]
		System.out.println(hs.contains("Welcome"));
		System.out.println(hs.isEmpty());
	}

}
