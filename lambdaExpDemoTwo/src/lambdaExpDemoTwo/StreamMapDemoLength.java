package lambdaExpDemoTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamMapDemoLength {

	public static void main(String[] args) {
		int num=0;
		List<String> vehicles= Arrays.asList("bus","car","bicycle","flight","train");
		List<Object> lengthVehicle=new ArrayList<Object>();
		lengthVehicle=vehicles.stream().map(n->n.length()).collect(Collectors.toList());
		
		System.out.println(vehicles);
		System.out.println(lengthVehicle);
		
	}

}
