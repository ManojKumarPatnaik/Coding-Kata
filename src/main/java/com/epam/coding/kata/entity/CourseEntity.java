package com.epam.coding.kata.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Course_Table")
@Data
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;

    @Column(name="Course_Name")
    private String courseName;
    @Column(name="Grade_Point")
    private String gradePoint;

    @ManyToOne(targetEntity = StudentRegistration.class)
    private CourseEntity course;


}
