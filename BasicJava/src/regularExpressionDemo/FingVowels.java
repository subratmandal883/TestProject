package regularExpressionDemo;

public class FingVowels {
public static boolean stringContainsVowels(String input){
	return input.toLowerCase().matches("[aeiou]*");
}
	public static void main(String[] args) {
		
		boolean result=stringContainsVowels("a");
		if(result==true) {
			System.out.println("there is vowels");
		}else {
			System.out.println("there is no vowels");
		}
	}

}
