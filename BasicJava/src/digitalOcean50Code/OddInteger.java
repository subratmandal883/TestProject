package digitalOcean50Code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

//6. How do you check if a list of integers contains only odd numbers in Java?
public class OddInteger {

	public static void main(String[] args) {
	int [] list= {1,2,3,4,5,6,7};
	int odd = 0;
	int even = 0;
	for(int i=0;i<list.length;i++) {
		if(list[i]%2!=0) {
			odd++;
		}else {
			even++;
		}
	}
	System.out.println("even is :"+even);
	System.out.println("odd is :"+odd);
	
	
	}

}
