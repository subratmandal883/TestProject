package StreamCollectionDemo;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamFilterMethodTwo {

	public static void main(String[] args) {
		List<Integer> num =Arrays.asList(5,10,15,30,25,20,35,60,45,50,55,40,65);
		List names = Arrays.asList("Reflection","Collection","Stream","Subrat");
		List<Integer> even=new ArrayList<Integer>();
		List<Integer>sort= new ArrayList<Integer>();
		List<String>sortname= new ArrayList<String>();
		List<String>nameWithS= new ArrayList<String>();
		even=num.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("even no :"+even);
		sort=num.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted value :"+sort);
		
		sortname=(List<String>) names.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted name :" +sortname);
		
		nameWithS=(List<String>) names.stream().filter(n->((String) n).startsWith("S")).collect(Collectors.toList());
		System.out.println("name start with S :" +nameWithS);
	}

}
