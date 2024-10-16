package StreamCollectionDemo;

import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("a","b","c","1","2","3");
		Object[] arr= list.stream().toArray();
		for(Object r:arr) 
		{
			System.out.println(r);
		}


	}

}
