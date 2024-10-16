package codeChucks;

public class ProductOfElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,3,5,1,2,3};
		int input=0;
		int result=1;
		for(int i=0;i<a.length;i++) {
			input=a[i];
			result=result*input;
		}
		System.out.println(result);
	}

}
