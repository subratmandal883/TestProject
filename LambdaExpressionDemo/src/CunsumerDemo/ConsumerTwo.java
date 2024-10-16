package CunsumerDemo;

import java.util.function.Consumer;

public class ConsumerTwo {

	public static void main(String[] args) {
		
		Consumer<String> c1=s->System.out.println(s+" "+" is white");
		Consumer<String> c2=s->System.out.println(s+" "+" gives us milk");
		Consumer<String> c3=s->System.out.println(s+" "+" eat only grass");
		
		/*
		 * c1.accept("Cow"); c2.accept("Cow"); c3.accept("herbivores animals");
		 */
		c1.andThen(c2).andThen(c3).accept("camel"); 
	}

}
