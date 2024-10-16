package arrayProblems;

public class ArrayFindEvenAndOdd {
	public static int even = 0 ;
	public static int odd = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-78,42,-83,69,-33,-59};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				odd++;
			}else {
				even++;
			}
		}
		System.out.println(even +" are even numbers");
		System.out.println(odd +" are odd numbers");
	}

}
