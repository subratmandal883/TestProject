package codingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {
		 int[] numbers = {5, 2, 8, 1, 9};
		 char[] ch= {'a','m','k','b','c','d'};
		 Arrays.spliterator(numbers);
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Alice");
        names.add("Charlie");
        Collections.sort(names);
        System.out.println(names);

	}

}
