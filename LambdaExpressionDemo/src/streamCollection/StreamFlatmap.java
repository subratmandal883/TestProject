package streamCollection;

import java.util.Arrays;
import java.util.List;

public class StreamFlatmap {

	public static void main(String[] args) {
		List<String> list1=Arrays.asList("Scarlett", "Ethan", "Jasmine");
		List<String> list2=Arrays.asList("Caleb", "Isabella", "Lucas");
		List<String> list3=Arrays.asList("Ava", "Noah", "Mia");
		
		List<List<String> > nameListSum=Arrays.asList(list1,list2,list3);
		nameListSum.stream().flatMap(n->n.stream()).forEach(System.out::println);
	}

	}


