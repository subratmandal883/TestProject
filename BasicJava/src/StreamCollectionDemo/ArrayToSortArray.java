package StreamCollectionDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToSortArray {
//accending,decending
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(4,2,7,1,5,6,3);
		List<Integer> sorted=list.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);//accending
		List<Integer> decendingSorted=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(decendingSorted);//decending
		List<String> nameList=Arrays.asList( "John","Mary","Kim","David","Smith");
		List<String>sortednameList=nameList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortednameList);
		List<String> reversesortednameList=nameList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversesortednameList);
	}

}
