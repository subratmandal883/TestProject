package streamCollection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo {

	public static void main(String[] args) {
		//flatmap();
		
		List<Integer> list1=Arrays.asList(1,2);
		List<Integer> list2=Arrays.asList(3,4);
		List<Integer> list3=Arrays.asList(5,6);
		
		List<List<Integer> > sumList=Arrays.asList(list1,list2,list3);
		
	List<Integer> finalList=sumList.stream().flatMap(x->x.stream().map(n->n*2)).collect(Collectors.toList());
	System.out.println(finalList);
	}

}
