package stringOperations;

public class SplitStringIntoWord2 {

	public static void main(String[] args) {
		String n="this is my dream car";
		String[] n1=n.split(" ");
		int count=0;
		for(String result:n1) {
			System.out.println(result);
			count++;
		}
		System.out.println(count);

	}

}
