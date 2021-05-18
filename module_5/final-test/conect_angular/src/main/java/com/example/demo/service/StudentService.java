package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {
    Page<Student> findAll(Pageable pageable);
    List<Student> findAll();
    void save(Student student);
    Student findById(String studentId);
    void delete(String studentId);
}
