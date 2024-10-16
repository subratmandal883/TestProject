package collectionProblems;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    for(int i=0;i<cars.size();i++) {
	    	System.out.print(cars.get(i)+", ");
	    	
	    }
	    System.out.println();
	    for(String cars1:cars) {
	    	System.out.print(cars1+"* ");
	    }
	}

}
