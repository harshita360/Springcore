package com.springcore.constructor;

public class Person {
	
	private String name;
	private Certi cert;

	public Person(String name, Certi cert) {
		
		this.name = name;
		this.cert=cert;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]"+ cert.name;
	}
	

}
