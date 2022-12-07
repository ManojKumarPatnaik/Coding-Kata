package com.epam.coding.kata.entity;

import com.epam.coding.kata.model.CourseModel;
import com.epam.coding.kata.model.Relatives;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "STUDENT")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="studentid")
	private Integer studentId;
	@Column(name="student_name")
	private String studentName;
	@Column(name = "student_dob")
	private String studentDob;
	@Column(name = "studentaddress")
	private String studentAddress;
	@Column(name = "student_contact_number")
	private long studentContactNumber;

	// Mapping and joining the Tables

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "studentrelatives_fk",referencedColumnName = "studentid")
	private List<Relatives> relatives;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "studentmarks_fk" ,referencedColumnName = "studentid" )
	private List<CourseModel> marks;
	
	public List<CourseModel> getMarks() {
		//marks = new ArrayList<Marks>();
		return marks;
	}
	public void setMarks(List<CourseModel> marks) {
		this.marks = marks;
	}
	


	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	public String getStudentDob() {
		return studentDob;
	}

	public void setStudentDOB(String studentdob) {
		this.studentDob = studentdob;
	}

	
	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentaddress) {
		this.studentAddress = studentaddress;
	}

	
	public long getStudentContactNumber() {
		return studentContactNumber;
	}

	public void setStudentContactNumber(long studentcontactnumber) {
		this.studentContactNumber = studentcontactnumber;
	}

	//@Column(name = "student_relatives")
	public List<Relatives> getRelatives() {
		return relatives;
	}

	public void setRelatives(List<Relatives> relatives) {
		this.relatives = relatives;
	}

	

}