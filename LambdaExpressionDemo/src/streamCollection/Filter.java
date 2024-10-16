package streamCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		
		List<Integer> al=Arrays.asList(10,20,30,40,50);
		List<Integer> evennumber=new ArrayList();
		//evennumber =al.stream().filter(n->n%2==0).collect(Collectors.toList());
		//System.out.println(evennumber); 
		//al.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		al.stream().filter(n->n%2==0).forEach(System.out::println);
		
		}

}
