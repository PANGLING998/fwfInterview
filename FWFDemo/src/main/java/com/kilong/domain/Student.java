package com.kilong.domain;

import java.io.Serializable;

public class Student implements Serializable {
    private int uid;
    private String name;
    private int age;
    private String grade;
    private int dorm;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
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

    public void setAge(int age) {
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

    public void setDorm(int dorm) {
        this.dorm = dorm;
    }

    public Student() {
    }

    public Student(int uid, String name, int age, String grade, int dorm) {
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
