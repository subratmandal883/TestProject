package OptionalClassDemoi;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		String[] str=new String[10];
		
		str[5]="Java optional class";
		Optional<String> checkNull=Optional.ofNullable(str[5]);
		if(checkNull.isPresent()) {
			
			System.out.println(str[5].toUpperCase());
		}else {
			
			System.out.println("no value in the str");
		}

	}

}
