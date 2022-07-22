package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
   private String subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public Example() {
	super();
	// TODO Auto-generated constructor stub
}
@PostConstruct
public void start() {
	System.out.println("This is start method");
}

@PreDestroy
public void ending() {
	System.out.println("This is ending method");
}
   
}
