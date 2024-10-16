package stringOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringAddToArraylist {

	public static void main(String[] args) {
		String[] geeks = {"Rahul", "Utkarsh",
                "Shubham", "Neelam","Rahul"};
		List<String>a=new ArrayList<String>(Arrays.asList(geeks));
		System.out.println(a.toString());
		
		Set<String> b=new HashSet<String>(Arrays.asList(geeks));
		System.out.println(b);
		
		

	}

}
