package stringOperations;

public class StringImutable {

	public static void main(String[] args) {
		String s1="subrat";
		String s2="subrat";
		
		System.out.println(s1==s2);
		s1+="mandal";
		System.out.println(s1==s2);
	}

}
