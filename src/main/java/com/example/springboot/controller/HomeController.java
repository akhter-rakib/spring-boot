package com.example.springboot.controller;

import com.example.springboot.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String welCome() {
        return "home";
    }

    @PostMapping(value = "/createStudent")
    public void createStudent(@ModelAttribute("student") Student student) {
        System.out.println(student.toString());
    }
}
