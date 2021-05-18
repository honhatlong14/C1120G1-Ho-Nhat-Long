package com.example.demo.controller;


import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("listStudent")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("")
    public ResponseEntity<List<Student>> getAll() {
        List<Student> studentList = studentService.findAll();
        if (studentList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<Student> getById(@PathVariable("id") Integer id) {
        Student student = studentService.findById("id");
        if (student == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Void> save(@RequestBody Student student) {
        studentService.save(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
