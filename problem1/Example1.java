package com.problem1;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		
		Student s1=new Student(11, "yash", 82);
		Student s2=new Student(32, "om", 52);
		Student s3=new Student(3, "ram", 92);
		
		List<Student>studentlist=new ArrayList<>();
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		 
		studentlist.sort((a,b)->a.rollno-b.rollno);
		System.out.println(studentlist);
	
	}

}
