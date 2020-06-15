package com.example.demo.component;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Manager {
    @Autowired
    private StudentRepository studentRepository;

    public Object getAllStudent(){
        return studentRepository.findAll();
    }
}
