package streamCollection;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StringPrintwithNotEmpty {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl"); 
		
		//strings.stream().filter(s->!s.isEmpty()).forEach(n->System.out.println(n));
		//strings.stream().map(n->n.length()).forEach(n->System.out.println(n));
		
		        Random random = new Random();
 random.ints().limit(10).forEach(n->System.out.println(n));;
		        //System.out.println("The random number is: " + randomNumber);
		    
		
	
	}

}
