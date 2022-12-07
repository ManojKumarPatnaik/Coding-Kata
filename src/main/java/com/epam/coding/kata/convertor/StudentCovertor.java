package com.epam.coding.kata.convertor;


import com.epam.coding.kata.entity.StudentRequestInput;
import com.epam.coding.kata.entity.Student;

public class StudentCovertor {
    public static Student convertToEntity(StudentRequestInput studentRequestInput) {
        Student student = new Student();
        student.setStudentAddress(studentRequestInput.getStudentAddress());
        student.setStudentContactNumber(studentRequestInput.getStudentContactNumber());
        student.setStudentDOB(studentRequestInput.getStudentdob());
        student.setStudentName(studentRequestInput.getStudentName());
        return student;

    }
}

