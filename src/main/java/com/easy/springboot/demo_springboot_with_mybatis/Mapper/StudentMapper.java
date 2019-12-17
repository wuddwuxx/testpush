package com.easy.springboot.demo_springboot_with_mybatis.Mapper;

import com.easy.springboot.demo_springboot_with_mybatis.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    int addStudent(Student student);
    int deleteStudentByAge(Integer age);
    int updateStudentByAge(Student student);
    Student getStudentByAge(Integer age);
    List<Student> getAllStudents();
}
