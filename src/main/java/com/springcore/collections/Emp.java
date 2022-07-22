package com.springcore.collections;

import java.util.Map;

public class Emp {
  private String name;
  private Map<String,String> courses;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Map<String, String> getCourses() {
	return courses;
}
public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}
public Emp(String name, Map<String, String> courses) {
	super();
	this.name = name;
	this.courses = courses;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
}
