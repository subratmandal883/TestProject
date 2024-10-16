package StreamCollectionDemo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMethod {

	public static void main(String[] args) {
		List<Integer> l =Arrays.asList(5,10,15,20,25,30,35,40,45,50,55,60,65);
		
		//List<Integer> evenNumbers = l.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		l.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		System.out.println("Reverse Order");
		
	List<Integer> rev=l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	
	System.out.println(rev);
	System.out.println("shuffling order ");
	List<Integer> shuffledList = l.stream()
            .sorted((a, b) -> Math.random() > 0.5 ? 1 : -1)
            .collect(Collectors.toList());
	System.out.println(shuffledList);
	}

}
