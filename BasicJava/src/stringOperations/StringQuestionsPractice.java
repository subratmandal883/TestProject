package stringOperations;

public class StringQuestionsPractice {

	public static void main(String[] args) {
		String n1="Computer";
		String n2="Design";
		int n3=n1.compareTo(n2);
		if(n3==-1) {
			System.out.println("string n2 is greater"+n3);
		}else if (n3==1) {
			System.out.println("string n1 greater"+n3);
		}else {
			System.out.println("string is greater"+n3);
		}
		
	}

}
