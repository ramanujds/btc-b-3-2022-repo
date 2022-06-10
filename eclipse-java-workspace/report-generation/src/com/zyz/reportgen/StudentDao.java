package com.zyz.reportgen;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	static List<Student> studentList;
	
	public StudentDao() {
		Student s1 = new Student(1001, "Harsh", 85, 77, 82);
		Student s2 = new Student(1002, "Priya", 87, 75, 83);
		Student s3 = new Student(1003, "Suraj", 72, 71, 61);
		Student s4 = new Student(1004, "Anil", 55, 42, 61);
		
		studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		
	}
	
	
	
	
}
