package stringProblems;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name= {"subrat","sneha","supriya","anayara"};
		System.out.println("Original array");
		for(String n:name) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("reverse array");
		for(int i=name.length-1;i>=0;i--) {
			
			System.out.print(name[i]+" ");
		}
	}

}
