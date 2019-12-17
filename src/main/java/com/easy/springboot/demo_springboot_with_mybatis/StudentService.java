package com.easy.springboot.demo_springboot_with_mybatis;

import com.easy.springboot.demo_springboot_with_mybatis.Mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;
    public int addStudent(Student student){
        return studentMapper.addStudent(student);
    }
    public int updateStudent(Student student){
        return studentMapper.updateStudentByAge(student);
    }
    public int deleteStudentByAge(Integer age){
        return studentMapper.deleteStudentByAge(age);
    }
    public Student getStudentByAge(Integer age){
        return studentMapper.getStudentByAge(age);
    }
    public List<Student> getAllStudents(){
        return studentMapper.getAllStudents();
    }

}
