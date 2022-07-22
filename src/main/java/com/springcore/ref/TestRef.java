package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestRef {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
        A e=(A)context.getBean("Aobj");
        
        System.out.println(e.getX());
        System.out.println(e.getObj().getY());
    }

}
