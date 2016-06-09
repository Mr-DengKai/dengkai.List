package com.orilore.set;

import java.util.*;

class students {
	private String name;
	private String number;

	students(String name, String number) {
		this.name = name;
		this.number = number;

	}

	@Override
	public String toString() {
		return String.format("(%s,%s)",name, number);
	}
}
public class student{

	public static void main(String[] args){
		Set student = new HashSet();
		student.add(new students("dengkai","121304011239"));
		student.add(new students("chou jay","121304011240"));
		student.add(new students("dengkai","121304011239"));
		
		System.out.println(student);
	}
}