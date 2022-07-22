package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestCons {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructor/consconfig.xml");
        Person p=(Person)context.getBean("Person1");
       
        System.out.println(p);
    }
}
