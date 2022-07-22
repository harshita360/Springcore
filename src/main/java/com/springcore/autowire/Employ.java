package com.springcore.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employ {
	
 @Autowired	//autowiring on property
 @Qualifier("address2")
 public Address address;

public Address getAddress() {
	return address;
}
//@Autowired //autowiring on setter injection
public void setAddress(Address address) {
	this.address = address;
}

public Employ() {
	super();
	// TODO Auto-generated constructor stub
}
//@Autowired autowiring on constructor
public Employ(Address address) {
	super();
	this.address = address;
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}
 
}
