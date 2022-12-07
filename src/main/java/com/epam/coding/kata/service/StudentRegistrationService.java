package com.epam.coding.kata.service;

import com.epam.coding.kata.entity.Student;
import com.epam.coding.kata.exception.StudentNotFoundException;
import com.epam.coding.kata.model.CourseModel;
import com.epam.coding.kata.model.Relatives;
import com.epam.coding.kata.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class StudentRegistrationService {

    @Autowired
    StudentRepository studentRepository;


    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public void studentRelative(Integer studentid, Relatives relative) {
        if (studentid != 0) {
            Optional<Student> optionalStudent = studentRepository.findById(studentid);
            if (optionalStudent.isPresent()) {
                Student student = optionalStudent.get();
                if (student.getRelatives() == null) {
                    student.setRelatives(new ArrayList<>());
                    student.getRelatives().add(relative);
                    studentRepository.save(student);
                } else if (student.getRelatives().size() <=4) {
                    System.out.println("size of the New Relative Entry----"+student.getRelatives().size());
                    student.getRelatives().add(relative);
                    studentRepository.save(student);
                }
            }
        }
    }

    public  List<Relatives> getRelatives(Integer studentid) {
        log.info("In get realtives list-------- "+ studentid);
        if (studentid != 0) {
            Optional<Student> optionalStudent = studentRepository.findById(studentid);
            if (optionalStudent.isPresent()) {
                Student student = optionalStudent.get();
                log.info(" Relative List is Runinig Fine------"+student.getRelatives());
                return student.getRelatives();
            }
        }
        return null;
    }

    public   List<CourseModel> getMarks(Integer studentid) {
        if (studentid != 0) {
            Optional<Student> optionalStudent = studentRepository.findById(studentid);
            if (optionalStudent.isPresent()) {
                Student student = optionalStudent.get();
                log.info(" Marks List is Runinig Fine");
                return student.getMarks();
            }
        }
        return null;
    }

    public  List<Student> getStudentList() {
        log.info(" StudentList Method is Runinig Fine");
        return studentRepository.findAll();
    }

    public void getRelatives(Integer studentid, Relatives relative) {
        if (studentid != 0) {
            Optional<Student> optionalStudent = studentRepository.findById(studentid);
            if (optionalStudent.isPresent()) {
                Student student = optionalStudent.get();
                student.getRelatives();
            }
            if (optionalStudent.isEmpty())
                throw new StudentNotFoundException("studentid-" + studentid);

        }

    }


    public void newMarksRegistration(Integer studentid, CourseModel marks) {
        if (studentid != 0) {
            Optional<Student> optionalStudent = studentRepository.findById(studentid);
            if (optionalStudent.isPresent()) {
                Student student = optionalStudent.get();
                if (student.getMarks().size() <= 0) {
                    log.info("The Entry Size of Marks ---" + student.getMarks().size());
                    List<CourseModel> marksList = student.getMarks();
                    marksList.add(marks);
                    long totalMarks = 0L;
                    totalMarks = marks.getEnglish() + marks.getHindi() + marks.getMarathi() + marks.getMaths()
                            + marks.getScience();
                    marksList.get(0).setTotalMarks(totalMarks);
                    double percentage = (double) totalMarks / 500 * 100;
                    marksList.get(0).setStudentPercentage(percentage);
                    studentRepository.save(student);
                }

            }
        }
    }
}
