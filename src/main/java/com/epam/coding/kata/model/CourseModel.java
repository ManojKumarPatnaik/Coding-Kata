package com.epam.coding.kata.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MARKS")
@Data
public class CourseModel implements Serializable {

	private static final long serialVersionUID = -214530958316484950L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "courseId")
	private long courseId;
	@Column(name = "english")
	private long english;
	@Column(name = "maths")
	private long maths;
	@Column(name = "science")
	private long science;
	@Column(name = "hindi")
	private long hindi;
	@Column(name = "marathi")
	private long marathi;
	@Column(name = "totalmarks")
	private long totalMarks;
	@Column(name = "studentpercentage")
	private double studentPercentage;


}
