package StreamCollectionDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMethods {
//findAny(),findFirst()
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("one","two","three","four");
		Optional<String> p=list.stream().findAny();
		System.out.println(p.get()); 
		
		Optional<String> q=list.stream().findFirst();
		System.out.println(q.get());
	}

}
