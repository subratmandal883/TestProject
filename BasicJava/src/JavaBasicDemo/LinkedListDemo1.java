package JavaBasicDemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(100);
		ll.add("welcome");
		ll.add(13.5);
		ll.add('A');
		ll.add(true);
		ll.add(null);
		System.out.println(ll);
	}}