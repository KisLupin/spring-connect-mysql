package com.example.demo.controller;

import com.example.demo.component.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private Manager manager;

    @GetMapping(path = "/getAllStudent")
    public Object getALlStudent(){
        return manager.getAllStudent();
    }
}
