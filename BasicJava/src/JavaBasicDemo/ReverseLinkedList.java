package JavaBasicDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ls=new LinkedList();
		
		ls.add(10);
		ls.add(30);
		ls.add(50);
		ls.add(40);
		ls.add(20);
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);
	}

}
