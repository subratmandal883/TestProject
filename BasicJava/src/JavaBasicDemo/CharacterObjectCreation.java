package JavaBasicDemo;

public class CharacterObjectCreation {

	public static void main(String[] args) {
		//method 1:BY USING NEW KEYWORD
		String st = "this is 4.30 pm, you can call me 5.56 pm";
		
		
		//method 2: BY USING VALUE OF 
		Character ch1= Character.valueOf('a');
		//method 3:by using autobox feature
		Character ch2='a';
		int n=(int)ch2;
		System.out.println(n);
		char charactermenu=(char)n;
		System.out.println("charactermenu : "+charactermenu);
		
		//System.out.println(ch1);
		//System.out.println(ch2);

		//System.out.println("this is isLetter method :"+Character.isLetter('z'));
		//System.out.println("this is isLetter method :"+Character.isLetter(2));
		//System.out.println("this is isDigit method :"+Character.isDigit('x'));
		//System.out.println("this is isDigit method :"+Character.isDigit('4'));
	}

}
