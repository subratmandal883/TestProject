package StreamCollectionDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMethodThree {

	public static void main(String[] args) {
		List<String> words= Arrays.asList("cup","forest",null,"sky","book",null,"theater");
		
		//List<String> newwords= words.stream().filter(w->w!=null).collect(Collectors.toList());
		//System.out.println(newwords);
		//words.stream().filter(w->w!=null).forEach(n->System.out.println(n));
		words.stream().filter(w->w!=null).forEach(System.out::println);
		
	}

}
