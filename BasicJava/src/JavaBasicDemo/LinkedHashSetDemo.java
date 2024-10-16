package JavaBasicDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(600);
		hs.add(600);
		hs.add(null);
		System.out.println(hs);
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(500);
		lhs.add(700);
		lhs.add(800);
		lhs.add(900);
		lhs.add(900);
		lhs.add(null);
		System.out.println(lhs);
		
		
	}

}
