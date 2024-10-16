package java50Questions;

import java.util.Arrays;
//import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Q6ListContainsOddNum {

	public static void main(String[] args) {
		//Find the oddNumber from the Array
		List<Integer> ls=List.of(1,2,9,3,4,6,5,8,7);
		List<Integer> finals=ls.stream().filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println(finals);
		//Find the String as per length size
		List<String> ls1=Arrays.asList("subrat","John","Patrichiya","linda");
		List<String> stringList=ls1.parallelStream().filter(x->x.length()>6).collect(Collectors.toList());
		System.out.println(stringList);
		List<Integer> ls2=List.copyOf(ls);
		List<Integer> result1=ls2.stream().filter(x->x>3).sorted().collect(Collectors.toList());
	System.out.println(result1);
	//find the data in Set property
	List<Integer> ls3=List.of(1,2,9,3,4,6,5,8,7,8,7,5,4,3);
	Set<Integer> setResult=ls3.stream().filter(x->x>0).collect(Collectors.toSet());
	System.out.println(setResult);
	//find the unique String/name
	List<String> ls4=Arrays.asList("subrat","John","Patrichiya","linda","John","subrat");
	Set<String> uniqueName=ls4.parallelStream().filter(x->x.length()>0).collect(Collectors.toSet());
	System.out.println(uniqueName);
	//4.distinct():
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*1).distinct().collect(Collectors.toList());
System.out.println(squaresList);
//find the Empty String
List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
long count=strings.stream().filter(string->string.isEmpty()).count();
System.out.println(count);
//Random and limit method
Random ran=new Random();
ran.ints().limit(1).forEach(System.out::println);
	}

}
