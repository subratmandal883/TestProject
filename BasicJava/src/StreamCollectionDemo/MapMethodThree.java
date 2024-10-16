package StreamCollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MapMethodThree {

	public static void main(String[] args) {
		
		List<Integer> num =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> multiple=new ArrayList<>();
		
		  multiple=num.stream().map(m->m*3).collect(Collectors.toList());
		  System.out.println(multiple);
		 
		
		
	}

}
