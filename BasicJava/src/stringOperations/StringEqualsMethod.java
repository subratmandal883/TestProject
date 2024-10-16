package stringOperations;

public class StringEqualsMethod {

	public static void main(String[] args) {
		String s1="string";
		String s2="string";
		String s3=new String("string");
		
		System.out.println("== operator for result for s1 and s2 :"+(s1==s2));
		System.out.println("== operator for result for s1 and s3 :"+(s1==s3));
		System.out.println("equls operator for result for s1 and s2 :"+(s1.equals(s2)));
		System.out.println("equls operator for result for s1 and s3 :"+(s1.equals(s3)));
	}

}
