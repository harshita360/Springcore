package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestCycle {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
       // Person p=(Person)context.getBean("Person1");
       context.registerShutdownHook();
      // Colddrink x=(Colddrink)context.getBean("Drink1");
       Example temp=(Example)context.getBean("Example1");
        //System.out.println(x);
       System.out.println(temp);
    }
}
