package com.easy.springboot.demo_springboot_with_mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public ModelAndView studentOps(){
        List<Student> allStudents = studentService.getAllStudents();
        System.out.println("getAllStudents>>>"+allStudents);
        System.out.println(allStudents.get(1));
        Student s2 = studentService.getStudentByAge(23);
        System.out.println(s2.getAge());
        ModelAndView mv = new ModelAndView();
        mv.addObject("students",allStudents);
        mv.setViewName("studentOps");
        return mv;
    }


//    @RequestMapping("/")
//    public String welcomePage(){
//        return "studentOps.html";
//    }

    @PostMapping("/studentOps")
    public ModelAndView studentOps2(){
        Student s2 = studentService.getStudentByAge(23);
        System.out.println(s2.getAge());
        ModelAndView mv = new ModelAndView();
        mv.addObject("students",s2);
        mv.setViewName("studentOps");
        return mv;
    }
}
