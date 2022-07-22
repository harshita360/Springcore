package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
        Emp e=(Emp)context.getBean("Employee1");
        
        System.out.println(e);
    }

}
