package com.epam.coding.kata.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentRequestInput {
	
	private String studentName;
	private String studentdob;
	private String studentAddress;
	private long studentContactNumber;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentdob() {
		return studentdob;
	}
	public void setStudentdob(String studentdob) {
		this.studentdob = studentdob;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public long getStudentContactNumber() {
		return studentContactNumber;
	}
	public void setStudentContactNumber(long studentContactNumber) {
		this.studentContactNumber = studentContactNumber;
	}

	
}
