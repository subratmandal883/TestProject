package PatternSide;

public class RightTriangle {

	public static void main(String[] args) {
		int r=5;
		for(int i=1;i<=r;i++) {
			for(int j=i;j<=r;j++) {
				System.out.print("  ");
			}for(int j=1;j<=i;j++) {
				System.out.print(" m");
			}
			System.out.println();
		}

	}

}
