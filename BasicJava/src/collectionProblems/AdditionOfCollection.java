package collectionProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdditionOfCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> cities = new ArrayList<String>(); 
	       
	      // Adding elements to arrlist
		 cities.add("New York");
	        cities.add("London");
	        cities.add("Tokyo");
	        cities.add("Paris");
	        cities.add("Berlin");
	        cities.add("Sydney");
	        cities.add("Toronto");
	        cities.add("Mumbai");
	        cities.add("Dubai");
	        cities.add("Moscow");
	       
	      System.out.println(cities);
	      System.out.println("Add and update list");
	      Collections.addAll(cities,"Bombay","Pune", "surat","kolkata");
	      System.out.println(cities);
	      System.out.println("sort the list");
	      Collections.sort(cities);
	      System.out.println(cities);
	}

}
