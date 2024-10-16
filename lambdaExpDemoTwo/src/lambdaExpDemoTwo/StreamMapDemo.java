package lambdaExpDemoTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo {

	public static void main(String[] args) {
		//convert list to upperCase
		List<String> vehicles= Arrays.asList("bus","car","bicycle","flight","train");
		List<String> vehiclesUpperCase=new ArrayList<String>();
		
		vehiclesUpperCase=vehicles.stream().map(m->m.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(vehiclesUpperCase);
	}

}
