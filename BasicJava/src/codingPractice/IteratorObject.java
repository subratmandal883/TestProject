package codingPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Make a collection
	   List<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    //Iterator for looping
	    Iterator<String> it=cars.iterator();
	    while(it.hasNext()) {
	    System.out.println(it.next());
	    }
	}

}
