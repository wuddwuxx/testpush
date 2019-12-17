package com.easy.springboot.demo_springboot_with_mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;


    @RequestMapping("/")
    public String welcomePage(){
        return "studentOps.html";
    }

    @GetMapping("/studentO")
    public void studentOps(){
//        Student s1 = new Student();
//        s1.setAge(3);
//        s1.setName("wenhan");
//        s1.setSex(3);
//        Student s3 = new Student();
//        s3.setAge(4);
//        s3.setName("enhan");
//        s3.setSex(4);
//        List<Student> students = new ArrayList<>();
//        students.add(s1);
//        students.add(s3);
//        int i = studentService.addStudent(s1);
//        System.out.println("addStudent>>>"+i);
        List<Student> allStudents = studentService.getAllStudents();
        System.out.println("getAllStudents>>>"+allStudents);
        System.out.println(allStudents.get(1));
        Student s2 = studentService.getStudentByAge(23);
        System.out.println(s2.getAge());
//        System.out.println(s1);
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("students",students);
//        mv.setViewName("students");
//        return mv;
    }
}
