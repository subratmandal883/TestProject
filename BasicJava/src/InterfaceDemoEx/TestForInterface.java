package InterfaceDemoEx;

import java.util.ArrayList;
import java.util.List;

interface Shape{
	public void draw();
}

class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("this is circle team");
		
	}
}
class Ractangle implements Shape{

	@Override
	public void draw() {
		System.out.println("this is ractangle team");
		
	}
	
}
class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("this is square team");
	}
}
public class TestForInterface {
	public static void main(String[] args) {
		Shape shape=new Square();
		shape.draw();
	}
}
