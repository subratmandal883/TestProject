package JavaBasicDemo;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionQueue {

	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue<String>();
		//Queue<String> queue=new ArrayDeque<String>();	
		
			queue.add("Rajesh");
			queue.add("Mank");
			queue.add("Jesh");
			
			Iterator itr=queue.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		
	}

}
