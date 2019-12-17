package com.easy.springboot.demo_springboot_with_mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/student")
public class StudentController2 {
    @Autowired
    StudentService studentService;
    @RequestMapping("/getStu/{age}")
    public String GetStu(@PathVariable int age){
        return studentService.getStudentByAge(age).toString();
    }
}
