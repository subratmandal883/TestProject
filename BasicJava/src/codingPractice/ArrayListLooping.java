package codingPractice;

import java.util.ArrayList;

public class ArrayListLooping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		//looping for arraylist
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		
	}

}
