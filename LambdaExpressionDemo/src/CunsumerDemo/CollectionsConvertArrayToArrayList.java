package CunsumerDemo;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsConvertArrayToArrayList {

	public static void main(String[] args) {
		int ary[]= {5,7,6,9,10,55,43};
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(int num:ary) {
			
			list.add(num);
		}
		
		Collections.sort(list);
		System.out.println("after sort...");
		for(int num:list) {
			System.out.println(num); 	
			
		}
		Collections.shuffle(list);
		System.out.println("after shuffel..");
		for(int num:list) {
			System.out.println(num); 	
			
		}
		
	}

}
