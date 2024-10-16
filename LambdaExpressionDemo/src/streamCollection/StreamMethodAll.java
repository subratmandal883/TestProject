package streamCollection;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethodAll {
	//distinct,limit,count;
	public static void main(String[] args) {
		List<String> listVehicle=Arrays.asList("cycle","bus","car","bike","plane","bus","car");
		//distinct
		//listVehicle.stream().distinct().forEach(System.out::println);
		//count
		long v=listVehicle.stream().distinct().count();
		//System.out.println(v);
		//limit
		//listVehicle.stream().limit(3).forEach(System.out::println);
		List<Integer> numList=Arrays.asList(1,2,3,4,5,6,7,-2,9,10);
		//min()
		Optional<Integer> min=numList.stream()
				.min((v1,v2)->{
			return v1.compareTo(v2);});
		System.out.println(min.get());
		//max()
		Optional<Integer> max=numList.stream().max((v1,v2)->{
		return v1.compareTo(v2);	
		});
		System.out.println(max.get());
		}

}
