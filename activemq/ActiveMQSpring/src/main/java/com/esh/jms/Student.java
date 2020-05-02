package com.esh.jms;

import java.io.Serializable;

public class Student implements Serializable{

	private int id;
	private String name;
	
	public Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Id: " + id;
	}
}
