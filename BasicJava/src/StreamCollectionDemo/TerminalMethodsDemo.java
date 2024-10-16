package StreamCollectionDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalMethodsDemo {

	public static void main(String[] args) {
		List<Integer> numList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//count()
		
		long evenNum=numList.stream().filter(n->n%2==0).count();
				System.out.println(evenNum);
				
		//min()
		Optional<Integer> minNum=numList.stream().min((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(minNum);
	}

}
