package JavaBasicDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo8 {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("a","b","c","1","2","3");
		Optional<String> reduce=list.stream().reduce((value,addvalue)->{
			return addvalue+value;
		});
	System.out.println(reduce.get());
	}

}
