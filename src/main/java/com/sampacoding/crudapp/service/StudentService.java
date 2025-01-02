package com.sampacoding.crudapp.service;

import java.util.List;

import com.sampacoding.crudapp.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
