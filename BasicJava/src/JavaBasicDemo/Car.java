package JavaBasicDemo;

import java.util.Scanner;

public class Car {
	String company;
	String model;
	String color;
	int engine;
	int price ;
	int milege;
	int wheels;
	   Car(String company,String model,String color,int engine,int price ,int milege,int wheels) {
	
		   this. company=company;
		   this.  model=model;
		   this.  color=color;
		   this. engine=engine;
		   this.  price=price ;
		   this.  milege=milege;
		   this.  wheels=wheels;
	   }
	   public void starTheCar() {
		   System.out.println("Start the car");
	   }
	   public void engineCC() {
		   System.out.println("Start the car engine");
	   }
	   public void marutiMethod() {
		   System.out.println("this is maruti company");
	   }
	   public void bmwMethod() {
		   System.out.println("this is BMW company");
	   }
	   public void stopTheCar() {
		   System.out.println("Stop the car");
	   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the engine cc between 1000cc to 2000 cc");
		int input=sc.nextInt();
		Car bmw= new Car("BMW","x1","black",1700,2400000,22,4);
		Car maruti=new Car("brezza","xls","white",1200,1200000,25,2);
		if(bmw.engine>=1201) {
			bmw.bmwMethod();
		}else if(maruti.engine<1200) {
			maruti.marutiMethod();
		}
	
	}

}
