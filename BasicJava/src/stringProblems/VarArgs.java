package stringProblems;

public class VarArgs {
	public static void display(int... numbers) {
		for(int i=0;i<numbers.length;i++) {
			
			System.out.println(numbers[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(10,40);
		display(40,50,60);
	}

}
