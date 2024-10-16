package StreamCollectionDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcatination {

	public static void main(String[] args) {
		List<String>animalList=Arrays.asList("Dog","Cat","Elephant");
		List<String>birdList=Arrays.asList("Peakock","Parrot","Crow");
		
		Stream<String>animal=animalList.stream();
		Stream<String>bird=birdList.stream();
		
		List<String> finalList=Stream.concat(animal,bird).collect(Collectors.toList());
		
		for(String fl:finalList) {
			System.out.println(fl);
		}
		

	}

}
