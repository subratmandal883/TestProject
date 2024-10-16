package com.springcore.CI;

public class Person {
 private String personName;
 private int personId;
public Person(String personName, int personId) {
	super();
	this.personName = personName;
	this.personId = personId;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Person [personName=" + personName + ", personId=" + personId + "]";
}
 
}
