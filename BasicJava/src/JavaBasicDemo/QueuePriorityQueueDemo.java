package JavaBasicDemo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueuePriorityQueueDemo {
public static void main(String[] args) {
	PriorityQueue pq=new PriorityQueue();
	
	//adding element add() /offer()
	pq.add("a");
	pq.add("b");
	pq.add("c");
	pq.offer("d");
	System.out.println(pq ); 
	//get head elements element()/peek() get head elements
	System.out.println(pq.element());
	System.out.println(pq.peek());
	//remove head element by remove() / poll() it get and remove from queue
	System.out.println(pq.poll());
	System.out.println(pq ); 
	
	
}
}
