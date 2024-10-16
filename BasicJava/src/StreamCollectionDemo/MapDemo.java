package StreamCollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
public static void main(String[] args) {
	List<String> vehicles=Arrays.asList("bus","car","bicycle","flight","train");
	List<Integer> v=new ArrayList<Integer>();

	//vehicles.stream().map(vname->vname.length()).forEach(n->System.out.print(n+" "));
	v=vehicles.stream().map(vname->vname.length()).collect(Collectors.toList());
	System.out.println("this stored new arraylist: "+v+" ");
	
	
	
}
		
}
