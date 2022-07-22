package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;

public class Test {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowire/autowireconfig.xml");
        Employ e=(Employ)context.getBean("emp1", Employ.class);
        
        System.out.println(e);
    }
}
