package JavaBasicDemo;

import java.util.Collections;
import java.util.LinkedList;


public class LinkedlIstDemo {
	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();
		
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("a");
		al.add("b");
		al.add("c");
		
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
	}

}
