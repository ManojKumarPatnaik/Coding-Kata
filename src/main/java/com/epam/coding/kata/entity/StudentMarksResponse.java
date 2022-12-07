package com.epam.coding.kata.entity;

import com.epam.coding.kata.model.CourseModel;

import java.util.List;

public class StudentMarksResponse {

	private String name;
	private List<CourseModel> marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CourseModel> getMarks() {
		return marks;
	}

	public void setMarks(List<CourseModel> marks) {
		this.marks = marks;
	}
}
