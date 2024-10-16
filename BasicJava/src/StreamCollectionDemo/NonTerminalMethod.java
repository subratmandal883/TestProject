package StreamCollectionDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonTerminalMethod {

	public static void main(String[] args) {
		List<String> vehicalList=Arrays.asList("bus","car","bicycle","bus","car","car","bike");
		//print direct 
		vehicalList.stream().distinct().forEach(n->System.out.println(n));
		//copy output to another collection
		List<String> distictVehical=vehicalList.stream().distinct().collect(Collectors.toList());
	System.out.println(distictVehical);
	//count Method
		
	long count=vehicalList.stream().count();
	System.out.println(count);
	
	
	}

}
