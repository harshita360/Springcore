package com.springcore.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;

public class Test {
	//System.out.println( "Hello World!" );
	public static void main(String[] args)
	{
    ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereo/stereoconfig.xml");
    Student e=(Student)context.getBean("student",Student.class);//name is lower case of class name or give explicit name
    System.out.println(e);
	}
    
}
