package stringProblems;

public class CopuValueofMethod {

	public static void main(String[] args) {
		char[] str1= {'H','e','l','l','o'};
		String message= "wel come %s to %d";
		String str2="";
		str2=String.copyValueOf(str1, 0, str1.length);
		System.out.println(str2);
		String str3=String.format(message,"friends",2025);
        System.out.println(str3);
	}

}
