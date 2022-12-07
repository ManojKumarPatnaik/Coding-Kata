package com.epam.coding.kata.controller;

import com.epam.coding.kata.convertor.StudentCovertor;
import com.epam.coding.kata.entity.StudentRequestInput;
import com.epam.coding.kata.model.CourseModel;
import com.epam.coding.kata.model.Relatives;
import com.epam.coding.kata.entity.Student;
import com.epam.coding.kata.service.StudentRegistrationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Slf4j
public class StudentRegistrationController {

    @Autowired
    private StudentRegistrationService studentRegistrationService;

    @PostMapping("/newstudent")
    public ResponseEntity<Student> newStudentRegistration(@Validated @RequestBody StudentRequestInput studentRequestInput) {

        log.info("New student registration ::" + studentRequestInput.toString());
        return new ResponseEntity<Student>(studentRegistrationService.save(StudentCovertor
                .convertToEntity(studentRequestInput)), HttpStatus.CREATED);
    }

    @PostMapping("/newrelative")
    public void newRelativeRegistration(@RequestParam Integer studentid, @RequestBody Relatives relative) {
        studentRegistrationService.studentRelative(studentid, relative);
    }


    @PostMapping("/newmarks")
    public void newMarksRegistration(@RequestParam Integer studentid, @RequestBody CourseModel marks) {
        studentRegistrationService.newMarksRegistration(studentid, marks);
    }


    @GetMapping("/relativelist")
    public List<Relatives> getAllStudentRelatives(@RequestParam Integer studentid) {
        return studentRegistrationService.getRelatives(studentid);
    }


    @GetMapping("/markslist")
    public List<CourseModel> getAllStudentMarks(@RequestParam Integer studentid) {
        return studentRegistrationService.getMarks(studentid);
    }


    @GetMapping("/studentlist")
    public List<Student> getAllStudent() {
        return studentRegistrationService.getStudentList();
    }

    @GetMapping("/relativelists/{studentid}")
    public Relatives getAllRelatives(@PathVariable Integer studentid, @RequestBody Relatives relative) {
        studentRegistrationService.studentRelative(studentid, relative);
        return getAllRelatives(studentid, relative);
    }

    @PostMapping("/students")
    public ResponseEntity<Object> createStudent(@RequestBody Student student) {
        Student body = studentRegistrationService.save(student);
        return ResponseEntity.ok(body);

    }

}
