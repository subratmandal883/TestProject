package JavaBasicDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {
		int[]arr= {11,5,6,120,8,9};
		
		List<int[]> li=Arrays.asList(arr);
	
		for(int sorted:arr) {
			System.out.println(sorted);
		}

	}

}
