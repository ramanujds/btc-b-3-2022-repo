package com.zyz.reportgen;

public class Student {

	private int rollNo;
	private String studentName;
	private int mathsScore;
	private int chemistryScore;
	private int physicsScore;
	
	private int total;
	
	
	public Student() {
	}


	public Student(int rollNo, String studentName, int mathsScore, int chemistryScore, int physicsScore) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.mathsScore = mathsScore;
		this.chemistryScore = chemistryScore;
		this.physicsScore = physicsScore;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getMathsScore() {
		return mathsScore;
	}


	public void setMathsScore(int mathsScore) {
		this.mathsScore = mathsScore;
	}


	public int getChemistryScore() {
		return chemistryScore;
	}


	public void setChemistryScore(int chemistryScore) {
		this.chemistryScore = chemistryScore;
	}


	public int getPhysicsScore() {
		return physicsScore;
	}


	public void setPhysicsScore(int physicsScore) {
		this.physicsScore = physicsScore;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", mathsScore=" + mathsScore
				+ ", chemistryScore=" + chemistryScore + ", physicsScore=" + physicsScore + ", total=" + total + "]";
	}
	
	
	
	
}
