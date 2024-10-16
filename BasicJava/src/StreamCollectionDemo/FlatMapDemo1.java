package StreamCollectionDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {

	public static void main(String[] args) {
		//flatmap()
		
		List<Integer> list1=Arrays.asList(1,2);
		List<Integer> list2=Arrays.asList(3,4);
		List<Integer> list3=Arrays.asList(5,6);
		
		List<List<Integer>> finallist=Arrays.asList(list1,list2,list3);
		
		//finallist.stream().flatMap(x->x.stream()).forEach(n->System.out.println(n));
		List<Integer> finalResult=finallist.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		//add flatmap() + map() method to above 
		List<Integer> flatWithMap=finallist.stream().flatMap(x->x.stream().map(n->n*2)).collect(Collectors.toList());
		
		System.out.println(finalResult);
		System.out.println(flatWithMap);
	}

}
