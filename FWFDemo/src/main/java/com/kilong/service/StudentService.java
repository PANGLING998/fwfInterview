package com.kilong.service;

import com.kilong.domain.Student;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public interface StudentService {
    /**
     *查询所有学生
     * @return
     */
    List<Student> FindAll() throws IOException;
    /**
     * 根据学号查询对应学生
     * @param id
     * @return
     */
    Student ByIdFind(String id);
    /**
     * 插入一条记录
     * @param student
     * @return
     */
    Integer InsertStudent(Student student);
    /**
     * 根据学号删除对应学生
     * @param uid
     * @return
     */
    int DeleteStudent(String uid);
    /**
     * 修改学生信息
     * @param student
     * @return
     */
    int UpdateStudent(Student student);
}
