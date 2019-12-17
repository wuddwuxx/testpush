package com.easy.springboot.demo_springboot_with_mybatis;

public class Student {
    private String name;
    private Integer sex;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSex() {
        return sex;
    }
    public String toString(){
        return  "Student{name="+name+",sex="+sex+",age="+age+"}";
    }

}
