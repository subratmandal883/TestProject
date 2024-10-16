package hibernetClass;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernetClass.student.Student;

public class Client {

	public static void main(String[] args) {
		System.out.println(1);
		Configuration configuration=new Configuration();
		System.out.println(2);
		configuration.configure();
		System.out.println(3);
		configuration.addAnnotatedClass(Student.class);
		System.out.println(4);
		
		SessionFactory factory=configuration.buildSessionFactory();
		System.out.println(5);
		System.out.println(factory);
		System.out.println(6);
	}

}
