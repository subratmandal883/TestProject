package JavaBasicDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateArrayListFromCollectionExample {

	public static void main(String[] args) {
		 List<Integer> firstFivePrimeNumbers = new ArrayList<>();
	        firstFivePrimeNumbers.add(2);
	        firstFivePrimeNumbers.add(3);
	        firstFivePrimeNumbers.add(5);
	        firstFivePrimeNumbers.add(11);
	        firstFivePrimeNumbers.add(7);
	        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
	        firstTenPrimeNumbers.add(13);
	        firstTenPrimeNumbers.add(17);
	        firstTenPrimeNumbers.add(29);
	        firstTenPrimeNumbers.add(23);
	        firstTenPrimeNumbers.add(19);
	       Collections.sort(firstTenPrimeNumbers);
	        for(int num:firstTenPrimeNumbers) {
	        	System.out.print(num+" ");
	        }
	        
	}

}
