package com.kilong.domain;

import java.io.Serializable;

public class Student implements Serializable {
    private String uid;
    private String name;
    private Integer age;
    private String grade;
    private Integer dorm;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getDorm() {
        return dorm;
    }

    public void setDorm(Integer dorm) {
        this.dorm = dorm;
    }

    public Student() {
    }

    public Student(String uid, String name, Integer age, String grade, Integer dorm) {
        this.uid = uid;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.dorm = dorm;
    }

    @Override
    public String toString() {
        return "Student{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                ", dorm=" + dorm +
                '}';
    }
}
