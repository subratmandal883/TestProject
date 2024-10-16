package stringOperations;

public class EceptionNDivededByZero {

	public static void main(String[] args) {
		int n=4;
		try {
			int result=n/0;
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
