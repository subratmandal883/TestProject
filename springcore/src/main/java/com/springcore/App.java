package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("configg.xml");
        System.out.println(1);
       Student student1= (Student) context.getBean("student1");
       System.out.println(2);
       Student student2= (Student) context.getBean("student2");
       System.out.println(3);
       Student student3= (Student) context.getBean("student3");
       System.out.println(4);
      System.out.println(student1);
      System.out.println(5);
      System.out.println(student2);
      System.out.println(5);
      System.out.println(student3);
      System.out.println(6);
    }
}
