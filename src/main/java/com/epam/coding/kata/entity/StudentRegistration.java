package com.epam.coding.kata.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class StudentRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Student_Id")
    private int studentId;
    @Column(name = "Student_Name")
    private String studentName;
    @Column(name = "Student_Roll_No")
    private int rollNo;
    @Column(name = "Student_Address")
    private String address;
    @Column(name = "Contact_No")
    private long contactNo;
    @Column(name = "Gender")
    private String gender;
//    private Course ListCourse;
}

