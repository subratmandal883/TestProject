package JavaBasicDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
	ArrayList<Integer> num=new ArrayList<Integer>();
	
	num.add(1);
	num.add(2);
	num.add(3);
	num.add(4);
	num.add(5);
	
   Iterator<Integer> n=num.iterator();
   while(n.hasNext()) {
	   Integer i= n.next();
	   
	   if(i>4) {
		   
		   n.remove();
		 
	   }
	    
   }
   System.out.println(num);
   
	
	}
}
