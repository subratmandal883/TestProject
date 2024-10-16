package StreamCollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapDemo {

	public static void main(String[] args) {
		List<String> vehicle=Arrays.asList("bus","car","bicycle","flight","train");
		
		List<String> vehicleUppercase=new ArrayList<String>();
		
		vehicleUppercase=vehicle.stream().map(m->m.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(vehicleUppercase);
	}

}
