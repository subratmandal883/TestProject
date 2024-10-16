package in.sp.main;


import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;


public class Main {

	
	public static void main(String[] args) throws IOException {
		System.out.println("start");
	ApplicationContext con= new ClassPathXmlApplicationContext("/in/sp/resources/fileContext.xml");
	
	Student std=(Student) con.getBean("stdId");

		
	std.display();
	
	System.out.println("End");
		
	}

}
//spring-bean.jar
//spring-core.jar
//spring-context.jar
//spring-expression.jar
//common-logging.jar