package JavaBasicDemo;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		System.out.println(hs); 
		HashSet hs2=new HashSet();
		hs2.add(60);
		hs2.add(70);
		hs2.add(80);
		hs2.add(90);
		hs2.add(10);
		hs2.addAll(hs);
		System.out.println(hs2);
		
	}

}
