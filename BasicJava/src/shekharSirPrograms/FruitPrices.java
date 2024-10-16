package shekharSirPrograms;

public class FruitPrices {

	public static void main(String[] args) {
		double[] prices=new double[3];
		
		prices[0]=1.99;
		prices[1]=2.49;
		prices[2]=3.25;
		int sum=0;
		for(int i=0;i<prices.length;i++) {
			 sum+=prices[i];
		}
		int avg=sum/prices.length;
		
System.out.println("average of the fruit prices is :"+avg);
//System.out.println(sum);
	}

}
